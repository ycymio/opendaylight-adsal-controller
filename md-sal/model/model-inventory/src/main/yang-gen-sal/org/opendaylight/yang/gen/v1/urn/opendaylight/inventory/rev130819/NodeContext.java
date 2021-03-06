package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;


/**
 * A node-context is a classifier for node elements which allows an RPC to provide 
 * a service on behalf of a particular element in the data tree.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-inventory</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-inventory.yang</i>):
 * <pre>
 * identity node-context {
 *     description
 *         "A node-context is a classifier for node elements which allows an RPC to provide a service on behalf of a particular element in the data tree.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-inventory/node-context</i>
 */
public abstract class NodeContext extends BaseIdentity
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-context");;

    public NodeContext() {
    
    
    }
    








}
