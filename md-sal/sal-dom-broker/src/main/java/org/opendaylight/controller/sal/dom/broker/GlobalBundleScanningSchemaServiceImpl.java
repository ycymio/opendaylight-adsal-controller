/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import static com.google.common.base.Preconditions.checkState;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.opendaylight.controller.sal.core.api.model.SchemaService;
import org.opendaylight.controller.sal.dom.broker.impl.SchemaContextProvider;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.concepts.Registration;
import org.opendaylight.yangtools.util.ListenerRegistry;
import org.opendaylight.yangtools.yang.model.api.Module;
import org.opendaylight.yangtools.yang.model.api.SchemaContext;
import org.opendaylight.yangtools.yang.model.api.SchemaContextListener;
import org.opendaylight.yangtools.yang.parser.repo.URLSchemaContextResolver;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalBundleScanningSchemaServiceImpl implements SchemaContextProvider, SchemaService, ServiceTrackerCustomizer<SchemaContextListener, SchemaContextListener>, AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(GlobalBundleScanningSchemaServiceImpl.class);

    private final ListenerRegistry<SchemaContextListener> listeners = new ListenerRegistry<>();
    private final URLSchemaContextResolver contextResolver = URLSchemaContextResolver.create("global-bundle");
    private final BundleScanner scanner = new BundleScanner();
    private final BundleContext context;

    private ServiceTracker<SchemaContextListener, SchemaContextListener> listenerTracker;
    private BundleTracker<Iterable<Registration>> bundleTracker;
    private boolean starting = true;
    private static GlobalBundleScanningSchemaServiceImpl instance;

    private GlobalBundleScanningSchemaServiceImpl(final BundleContext context) {
        this.context = Preconditions.checkNotNull(context);
    }

    public synchronized static GlobalBundleScanningSchemaServiceImpl createInstance(final BundleContext ctx) {
        Preconditions.checkState(instance == null);
        instance = new GlobalBundleScanningSchemaServiceImpl(ctx);
        instance.start();
        return instance;
    }

    public synchronized static GlobalBundleScanningSchemaServiceImpl getInstance() {
        Preconditions.checkState(instance != null, "Global Instance was not instantiated");
        return instance;
    }

    @VisibleForTesting
    public static synchronized void destroyInstance() {
        try {
            instance.close();
        } finally {
            instance = null;
        }
    }

    public BundleContext getContext() {
        return context;
    }

    public void start() {
        checkState(context != null);

        listenerTracker = new ServiceTracker<>(context, SchemaContextListener.class, GlobalBundleScanningSchemaServiceImpl.this);
        bundleTracker = new BundleTracker<>(context, BundleEvent.RESOLVED | BundleEvent.UNRESOLVED, scanner);
        bundleTracker.open();
        listenerTracker.open();
        starting = false;
        tryToUpdateSchemaContext();
    }

    @Override
    public SchemaContext getSchemaContext() {
        return getGlobalContext();
    }

    @Override
    public SchemaContext getGlobalContext() {
        return contextResolver.getSchemaContext().orNull();
    }

    @Override
    public void addModule(final Module module) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SchemaContext getSessionContext() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeModule(final Module module) {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized ListenerRegistration<SchemaContextListener> registerSchemaContextListener(final SchemaContextListener listener) {
        Optional<SchemaContext> potentialCtx = contextResolver.getSchemaContext();
        if(potentialCtx.isPresent()) {
            listener.onGlobalContextUpdated(potentialCtx.get());
        }
        return listeners.register(listener);
    }

    @Override
    public void close() {
        if (bundleTracker != null) {
            bundleTracker.close();
        }
        if (listenerTracker != null) {
            listenerTracker.close();
        }

        for (ListenerRegistration<SchemaContextListener> l : listeners.getListeners()) {
            l.close();
        }
    }

    private synchronized void updateContext(final SchemaContext snapshot) {
        Object[] services = listenerTracker.getServices();
        for (ListenerRegistration<SchemaContextListener> listener : listeners) {
            try {
                listener.getInstance().onGlobalContextUpdated(snapshot);
            } catch (Exception e) {
                LOG.error("Exception occured during invoking listener", e);
            }
        }
        if (services != null) {
            for (Object rawListener : services) {
                final SchemaContextListener listener = (SchemaContextListener) rawListener;
                try {
                    listener.onGlobalContextUpdated(snapshot);
                } catch (Exception e) {
                    LOG.error("Exception occured during invoking listener {}", listener, e);
                }
            }
        }
    }

    private class BundleScanner implements BundleTrackerCustomizer<Iterable<Registration>> {
        @Override
        public Iterable<Registration> addingBundle(final Bundle bundle, final BundleEvent event) {

            if (bundle.getBundleId() == 0) {
                return Collections.emptyList();
            }

            final Enumeration<URL> enumeration = bundle.findEntries("META-INF/yang", "*.yang", false);
            if (enumeration == null) {
                return Collections.emptyList();
            }

            final List<Registration> urls = new ArrayList<>();
            while (enumeration.hasMoreElements()) {
                final URL u = enumeration.nextElement();
                try {
                    urls.add(contextResolver.registerSource(u));
                    LOG.debug("Registered {}", u);
                } catch (Exception e) {
                    LOG.warn("Failed to register {}, ignoring it", e);
                }
            }

            if (!urls.isEmpty()) {
                LOG.debug("Loaded {} new URLs, rebuilding schema context", urls.size());
                tryToUpdateSchemaContext();
            }

            return ImmutableList.copyOf(urls);
        }

        @Override
        public void modifiedBundle(final Bundle bundle, final BundleEvent event, final Iterable<Registration> object) {
            LOG.debug("Modified bundle {} {} {}", bundle, event, object);
        }

        /**
         * If removing YANG files makes yang store inconsistent, method
         * {@link #getYangStoreSnapshot()} will throw exception. There is no
         * rollback.
         */

        @Override
        public synchronized void removedBundle(final Bundle bundle, final BundleEvent event, final Iterable<Registration> urls) {
            for (Registration url : urls) {
                try {
                    url.close();
                } catch (Exception e) {
                    LOG.warn("Failed do unregister URL {}, proceeding", url, e);
                }
            }
            tryToUpdateSchemaContext();
        }
    }

    @Override
    public synchronized SchemaContextListener addingService(final ServiceReference<SchemaContextListener> reference) {

        SchemaContextListener listener = context.getService(reference);
        SchemaContext _ctxContext = getGlobalContext();
        if (getContext() != null && _ctxContext != null) {
            listener.onGlobalContextUpdated(_ctxContext);
        }
        return listener;
    }

    public synchronized void tryToUpdateSchemaContext() {
        if (starting) {
            return;
        }
        Optional<SchemaContext> schema = contextResolver.getSchemaContext();
        if(schema.isPresent()) {
            updateContext(schema.get());
        }
    }

    @Override
    public void modifiedService(final ServiceReference<SchemaContextListener> reference, final SchemaContextListener service) {
        // NOOP
    }

    @Override
    public void removedService(final ServiceReference<SchemaContextListener> reference, final SchemaContextListener service) {
        context.ungetService(reference);
    }
}
