package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.NotificationState;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-binding-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-binding-broker-impl.yang</i>):
 * <pre>
 * case binding-notification-broker {
 *     container notifications {
 *         leaf published {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-binding-broker-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl?revision=2013-10-28)binding-notification-broker</i>
 */
public interface BindingNotificationBroker
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingNotificationBroker>,
    NotificationState,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl","2013-10-28","binding-notification-broker");;


}

