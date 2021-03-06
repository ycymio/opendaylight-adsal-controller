package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierKey;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-topology</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-topology.yang</i>):
 * <pre>
 * list node-identifier {
 *     key "type" 
 * "identifier"
 *     leaf type {
 *         type node-type-ref;
 *     }
 *     leaf identifier {
 *         type uri;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-topology/node-identifiers/node-identifier</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierBuilder@see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierKey
 */
public interface NodeIdentifier
    extends
    ChildOf<NodeIdentifiers>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>,
    Identifiable<NodeIdentifierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:general","2013-10-30","node-identifier");;

    java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> getType();
    
    Uri getIdentifier();
    
    /**
     * Returns Primary Key of Yang List Type
     */
    NodeIdentifierKey getKey();

}

