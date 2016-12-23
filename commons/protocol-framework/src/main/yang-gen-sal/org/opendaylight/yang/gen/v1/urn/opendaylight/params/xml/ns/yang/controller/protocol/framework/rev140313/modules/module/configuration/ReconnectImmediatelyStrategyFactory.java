package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.reconnect.immediately.strategy.factory.ReconnectExecutor;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>protocol-framework</b>
 * <br />(Source path: <i>META-INF\yang\odl-protocol-framework-cfg.yang</i>):
 * <pre>
 * case reconnect-immediately-strategy-factory {
 *     leaf reconnect-timeout {
 *         type int32;
 *     }
 *     container reconnect-executor {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:protocol:framework?revision=2014-03-13)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>protocol-framework/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:protocol:framework?revision=2014-03-13)reconnect-immediately-strategy-factory</i>
 */
public interface ReconnectImmediatelyStrategyFactory
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.ReconnectImmediatelyStrategyFactory>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:protocol:framework","2014-03-13","reconnect-immediately-strategy-factory");;

    java.lang.Integer getReconnectTimeout();
    
    ReconnectExecutor getReconnectExecutor();

}

