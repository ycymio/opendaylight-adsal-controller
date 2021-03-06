package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.timed.reconnect.strategy.factory.TimedReconnectExecutor;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.math.BigDecimal;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>protocol-framework</b>
 * <br />(Source path: <i>META-INF\yang\odl-protocol-framework-cfg.yang</i>):
 * <pre>
 * case timed-reconnect-strategy-factory {
 *     leaf deadline {
 *         type int64;
 *     }
 *     leaf max-attempts {
 *         type int64;
 *     }
 *     leaf max-sleep {
 *         type int64;
 *     }
 *     leaf min-sleep {
 *         type int64;
 *     }
 *     leaf sleep-factor {
 *         type decimal64;
 *     }
 *     leaf connect-time {
 *         type int32;
 *     }
 *     container timed-reconnect-executor {
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
 * <i>protocol-framework/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:protocol:framework?revision=2014-03-13)timed-reconnect-strategy-factory</i>
 */
public interface TimedReconnectStrategyFactory
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.protocol.framework.rev140313.modules.module.configuration.TimedReconnectStrategyFactory>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:protocol:framework","2014-03-13","timed-reconnect-strategy-factory");;

    java.lang.Long getDeadline();
    
    java.lang.Long getMaxAttempts();
    
    java.lang.Long getMaxSleep();
    
    java.lang.Long getMinSleep();
    
    BigDecimal getSleepFactor();
    
    java.lang.Integer getConnectTime();
    
    TimedReconnectExecutor getTimedReconnectExecutor();

}

