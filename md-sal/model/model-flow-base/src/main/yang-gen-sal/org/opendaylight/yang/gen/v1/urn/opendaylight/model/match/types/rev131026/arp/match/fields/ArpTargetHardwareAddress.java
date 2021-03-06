package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * ARP target hardware address.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * container arp-target-hardware-address {
 *     leaf address {
 *         type mac-address;
 *     }
 *     leaf mask {
 *         type mac-address;
 *     }
 *     uses mac-address-filter;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/arp-match-fields/arp-target-hardware-address</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddressBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddressBuilder
 */
public interface ArpTargetHardwareAddress
    extends
    ChildOf<ArpMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddress>,
    MacAddressFilter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","arp-target-hardware-address");;


}

