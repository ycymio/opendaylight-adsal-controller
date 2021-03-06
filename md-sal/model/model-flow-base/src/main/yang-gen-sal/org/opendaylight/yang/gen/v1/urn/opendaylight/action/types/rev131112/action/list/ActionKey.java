package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class ActionKey
 implements Identifier<Action> {
    private static final long serialVersionUID = 7915956880225441276L;
    final private java.lang.Integer _order;

    public ActionKey(java.lang.Integer _order) {
    
    
        this._order = _order;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ActionKey(ActionKey source) {
        this._order = source._order;
    }


    public java.lang.Integer getOrder() {
        return _order;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_order == null) ? 0 : _order.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ActionKey other = (ActionKey) obj;
        if (_order == null) {
            if (other._order != null) {
                return false;
            }
        } else if(!_order.equals(other._order)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_order != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_order=");
            builder.append(_order);
         }
        return builder.append(']').toString();
    }



}
