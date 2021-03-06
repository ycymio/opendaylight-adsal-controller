package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.write.setfield.miss;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>opendaylight-table-types</b>
 * <br />(Source path: <i>META-INF\yang\opendaylight-table-types.yang</i>):
 * <pre>
 * container write-setfield-miss {
 *     list set-field-match {
 *         key "match-type"
 *         leaf match-type {
 *             type identityref;
 *         }
 *         leaf has-mask {
 *             type boolean;
 *         }
 *     }
 *     uses set-field-match;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>opendaylight-table-types/table-feature-prop-type/table-feature-prop-type/write-setfield-miss/write-setfield-miss</i>
 * 
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.write.setfield.miss.WriteSetfieldMissBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.write.setfield.miss.WriteSetfieldMissBuilder
 */
public interface WriteSetfieldMiss
    extends
    ChildOf<TableFeaturePropType>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.write.setfield.miss.WriteSetfieldMiss>,
    SetFieldMatch
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:types","2013-10-26","write-setfield-miss");;


}

