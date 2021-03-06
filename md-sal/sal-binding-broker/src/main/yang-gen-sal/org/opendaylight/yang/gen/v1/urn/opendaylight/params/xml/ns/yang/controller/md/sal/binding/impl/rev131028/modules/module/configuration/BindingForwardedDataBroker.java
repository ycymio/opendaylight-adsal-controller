package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-sal-binding-broker-impl</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-binding-broker-impl.yang</i>):
 * <pre>
 * case binding-forwarded-data-broker {
 *     container binding-forwarded-data-broker {
 *         container dom-async-broker {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl?revision=2013-10-28)type {
 *                     leaf type {
 *                         type service-type-ref;
 *                     }
 *                 }
 *             }
 *         }
 *         container binding-mapping-service {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *             leaf name {
 *                 type leafref;
 *             }
 *             uses service-ref {
 *                 refine (urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl?revision=2013-10-28)type {
 *                     leaf type {
 *                         type service-type-ref;
 *                     }
 *                 }
 *             }
 *         }
 *         uses dom-forwarding-component;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-sal-binding-broker-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl?revision=2013-10-28)binding-forwarded-data-broker</i>
 */
public interface BindingForwardedDataBroker
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingForwardedDataBroker>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl","2013-10-28","binding-forwarded-data-broker");;

    org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.forwarded.data.broker.BindingForwardedDataBroker getBindingForwardedDataBroker();

}

