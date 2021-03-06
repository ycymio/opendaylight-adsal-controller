package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigInteger;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-match-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-match-types.yang</i>):
 * <pre>
 * container tunnel {
 *     leaf tunnel-id {
 *         type uint64;
 *     }
 *     leaf tunnel-mask {
 *         type uint64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-match-types/match/tunnel</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.TunnelBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.TunnelBuilder
 */
public interface Tunnel
    extends
    ChildOf<Match>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:match:types","2013-10-26","tunnel");;

    /**
     * Metadata associated in the logical port
     */
    BigInteger getTunnelId();
    
    BigInteger getTunnelMask();

}

