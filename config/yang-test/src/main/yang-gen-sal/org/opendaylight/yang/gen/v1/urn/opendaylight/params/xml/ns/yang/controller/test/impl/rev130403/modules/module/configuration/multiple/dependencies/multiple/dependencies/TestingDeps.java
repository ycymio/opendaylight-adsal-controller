package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.multiple.dependencies;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.MultipleDependencies;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * list testing-deps {
 *     key     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)multiple-dependencies/multiple-dependencies/testing-deps</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.multiple.dependencies.TestingDepsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.multiple.dependencies.TestingDepsBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.multiple.dependencies.TestingDepsKey
 */
public interface TestingDeps
    extends
    ChildOf<MultipleDependencies>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.multiple.dependencies.multiple.dependencies.TestingDeps>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","testing-deps");;


}

