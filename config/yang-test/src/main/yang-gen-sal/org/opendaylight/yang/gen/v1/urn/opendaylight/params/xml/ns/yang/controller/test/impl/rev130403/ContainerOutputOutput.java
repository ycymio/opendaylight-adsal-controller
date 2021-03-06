package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.container.output.output.RetValContainer;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * container output {
 *     container retValContainer {
 *         leaf v1 {
 *             type string;
 *         }
 *         leaf v2 {
 *             type uint32;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/container-output/output</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ContainerOutputOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ContainerOutputOutputBuilder
 */
public interface ContainerOutputOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.ContainerOutputOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","output");;

    RetValContainer getRetValContainer();

}

