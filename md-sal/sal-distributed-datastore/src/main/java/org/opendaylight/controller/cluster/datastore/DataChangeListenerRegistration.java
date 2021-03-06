/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.cluster.datastore;

import akka.actor.PoisonPill;
import akka.actor.Props;
import akka.japi.Creator;
import org.opendaylight.controller.cluster.common.actor.AbstractUntypedActor;

import org.opendaylight.controller.cluster.datastore.messages.CloseDataChangeListenerRegistration;
import org.opendaylight.controller.cluster.datastore.messages.CloseDataChangeListenerRegistrationReply;
import org.opendaylight.controller.md.sal.common.api.data.AsyncDataChangeListener;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode;

public class DataChangeListenerRegistration extends AbstractUntypedActor {

    private final ListenerRegistration<AsyncDataChangeListener<YangInstanceIdentifier, NormalizedNode<?, ?>>>
        registration;

    public DataChangeListenerRegistration(
        ListenerRegistration<AsyncDataChangeListener<YangInstanceIdentifier, NormalizedNode<?, ?>>> registration) {
        this.registration = registration;
    }

    @Override
    public void handleReceive(Object message) throws Exception {
        if (message.getClass().equals(CloseDataChangeListenerRegistration.SERIALIZABLE_CLASS)) {
            closeListenerRegistration(
                new CloseDataChangeListenerRegistration());
        }
    }

    public static Props props(
        final ListenerRegistration<AsyncDataChangeListener<YangInstanceIdentifier, NormalizedNode<?, ?>>> registration) {
        return Props.create(new DataChangeListenerRegistrationCreator(registration));
    }

    private void closeListenerRegistration(
        CloseDataChangeListenerRegistration message) {
        registration.close();
        getSender()
            .tell(new CloseDataChangeListenerRegistrationReply().toSerializable(), getSelf());
        getSelf().tell(PoisonPill.getInstance(), getSelf());
    }

    private static class DataChangeListenerRegistrationCreator
                                            implements Creator<DataChangeListenerRegistration> {
        final ListenerRegistration<AsyncDataChangeListener<YangInstanceIdentifier,
                                                           NormalizedNode<?, ?>>> registration;

        DataChangeListenerRegistrationCreator(
                ListenerRegistration<AsyncDataChangeListener<YangInstanceIdentifier,
                                                             NormalizedNode<?, ?>>> registration) {
            this.registration = registration;
        }

        @Override
        public DataChangeListenerRegistration create() throws Exception {
            return new DataChangeListenerRegistration(registration);
        }
    }
}
