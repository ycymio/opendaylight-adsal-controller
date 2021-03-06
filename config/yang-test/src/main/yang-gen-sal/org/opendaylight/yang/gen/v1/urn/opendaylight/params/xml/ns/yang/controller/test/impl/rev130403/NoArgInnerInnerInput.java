package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>config-test-impl</b>
 * <br />(Source path: <i>META-INF\yang\config-test-impl.yang</i>):
 * <pre>
 * container input {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 *     leaf arg1 {
 *         type uint16;
 *     }
 *     leaf arg2 {
 *         type boolean;
 *     }
 *     uses rpc-context-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:test:impl?revision=2013-04-03)context-instance {
 *             leaf context-instance {
 *                 type instance-identifier;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>config-test-impl/noArgInnerInner/input</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInnerInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInnerInputBuilder
 */
public interface NoArgInnerInnerInput
    extends
    RpcContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.NoArgInnerInnerInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:test:impl","2013-04-03","input");;

    java.lang.Integer getArg1();
    
    java.lang.Boolean isArg2();

}

