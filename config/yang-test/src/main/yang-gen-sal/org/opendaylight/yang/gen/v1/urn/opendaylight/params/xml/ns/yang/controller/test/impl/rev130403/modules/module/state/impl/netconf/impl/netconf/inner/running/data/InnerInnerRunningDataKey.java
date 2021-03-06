package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningData;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class InnerInnerRunningDataKey
 implements Identifier<InnerInnerRunningData> {
    private static final long serialVersionUID = 1659654476715806683L;
    final private java.lang.Integer _simpleInt3;

    public InnerInnerRunningDataKey(java.lang.Integer _simpleInt3) {
    
    
        this._simpleInt3 = _simpleInt3;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InnerInnerRunningDataKey(InnerInnerRunningDataKey source) {
        this._simpleInt3 = source._simpleInt3;
    }


    public java.lang.Integer getSimpleInt3() {
        return _simpleInt3;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_simpleInt3 == null) ? 0 : _simpleInt3.hashCode());
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
        InnerInnerRunningDataKey other = (InnerInnerRunningDataKey) obj;
        if (_simpleInt3 == null) {
            if (other._simpleInt3 != null) {
                return false;
            }
        } else if(!_simpleInt3.equals(other._simpleInt3)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.state.impl.netconf.impl.netconf.inner.running.data.InnerInnerRunningDataKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_simpleInt3 != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_simpleInt3=");
            builder.append(_simpleInt3);
         }
        return builder.append(']').toString();
    }



}
