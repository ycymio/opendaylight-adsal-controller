/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.netconf.client;

import io.netty.channel.Channel;

import java.util.Collection;

import org.opendaylight.controller.netconf.nettyutil.AbstractNetconfSession;
import org.opendaylight.controller.netconf.nettyutil.handler.NetconfEXICodec;
import org.opendaylight.controller.netconf.nettyutil.handler.NetconfEXIToMessageDecoder;
import org.opendaylight.controller.netconf.nettyutil.handler.NetconfMessageToEXIEncoder;
import org.opendaylight.controller.netconf.nettyutil.handler.NetconfMessageToXMLEncoder;
import org.opendaylight.controller.netconf.nettyutil.handler.NetconfXMLToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetconfClientSession extends AbstractNetconfSession<NetconfClientSession, NetconfClientSessionListener> {

    private static final Logger logger = LoggerFactory.getLogger(NetconfClientSession.class);
    private final Collection<String> capabilities;

    /**
     * Construct a new session.
     *
     * @param sessionListener
     * @param channel
     * @param sessionId
     * @param capabilities set of advertised capabilities. Expected to be immutable.
     */
    public NetconfClientSession(final NetconfClientSessionListener sessionListener, final Channel channel, final long sessionId,
            final Collection<String> capabilities) {
        super(sessionListener, channel, sessionId);
        this.capabilities = capabilities;
        logger.debug("Client Session {} created", toString());
    }

    public Collection<String> getServerCapabilities() {
        return capabilities;
    }

    @Override
    protected NetconfClientSession thisInstance() {
        return this;
    }

    @Override
    protected void addExiHandlers(final NetconfEXICodec exiCodec) {
        // TODO used only in negotiator, client supports only auto start-exi
        replaceMessageDecoder(new NetconfEXIToMessageDecoder(exiCodec));
        replaceMessageEncoder(new NetconfMessageToEXIEncoder(exiCodec));
    }

    @Override
    public void stopExiCommunication() {
        // TODO never used, Netconf client does not support stop-exi
        replaceMessageDecoder(new NetconfXMLToMessageDecoder());
        replaceMessageEncoder(new NetconfMessageToXMLEncoder());
    }
}