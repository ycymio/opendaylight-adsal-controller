package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-action-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-action-types.yang</i>):
 * <pre>
 * case set-next-hop-action-case {
 *     container set-next-hop-action {
 *         choice address {
 *             case ipv4 {
 *                 leaf ipv4-address {
 *                     type ipv4-prefix;
 *                 }
 *             }
 *             case ipv6 {
 *                 leaf ipv6-address {
 *                     type ipv6-prefix;
 *                 }
 *             }
 *         }
 *         uses address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-action-types/action/action/set-next-hop-action-case</i>
 */
public interface SetNextHopActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetNextHopActionCase>,
    Action
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:action:types","2013-11-12","set-next-hop-action-case");;

    SetNextHopAction getSetNextHopAction();

}
