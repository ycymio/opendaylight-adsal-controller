package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import java.io.Serializable;
import java.util.List;
import com.google.common.collect.Lists;


/**
 * The bits built-in type represents a bit set. That is, a bits value is a set of flags identified by small integer position numbers starting at 0.  Each bit number has an assigned name.
 */
public class MeterFlags
 implements Serializable {
    private static final long serialVersionUID = -4587974738717018148L;
    final private java.lang.Boolean _meterKbps;
    final private java.lang.Boolean _meterPktps;
    final private java.lang.Boolean _meterBurst;
    final private java.lang.Boolean _meterStats;

    public MeterFlags(java.lang.Boolean _meterBurst, java.lang.Boolean _meterKbps, java.lang.Boolean _meterPktps, java.lang.Boolean _meterStats) {
    
    
        this._meterKbps = _meterKbps;
        this._meterPktps = _meterPktps;
        this._meterBurst = _meterBurst;
        this._meterStats = _meterStats;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MeterFlags(MeterFlags source) {
        this._meterKbps = source._meterKbps;
        this._meterPktps = source._meterPktps;
        this._meterBurst = source._meterBurst;
        this._meterStats = source._meterStats;
    }

    public static MeterFlags getDefaultInstance(String defaultValue) {
        List<java.lang.String> properties = Lists.newArrayList("meterBurst",
        "meterKbps",
        "meterPktps",
        "meterStats"
        );
        if (!properties.contains(defaultValue)) {
            throw new java.lang.IllegalArgumentException("invalid default parameter");
        }
        int i = 0;
        return new MeterFlags(
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null,
        properties.get(i++).equals(defaultValue) ? java.lang.Boolean.TRUE : null
        );
    }

    public java.lang.Boolean isMeterKbps() {
        return _meterKbps;
    }
    
    public java.lang.Boolean isMeterPktps() {
        return _meterPktps;
    }
    
    public java.lang.Boolean isMeterBurst() {
        return _meterBurst;
    }
    
    public java.lang.Boolean isMeterStats() {
        return _meterStats;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_meterKbps == null) ? 0 : _meterKbps.hashCode());
        result = prime * result + ((_meterPktps == null) ? 0 : _meterPktps.hashCode());
        result = prime * result + ((_meterBurst == null) ? 0 : _meterBurst.hashCode());
        result = prime * result + ((_meterStats == null) ? 0 : _meterStats.hashCode());
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
        MeterFlags other = (MeterFlags) obj;
        if (_meterKbps == null) {
            if (other._meterKbps != null) {
                return false;
            }
        } else if(!_meterKbps.equals(other._meterKbps)) {
            return false;
        }
        if (_meterPktps == null) {
            if (other._meterPktps != null) {
                return false;
            }
        } else if(!_meterPktps.equals(other._meterPktps)) {
            return false;
        }
        if (_meterBurst == null) {
            if (other._meterBurst != null) {
                return false;
            }
        } else if(!_meterBurst.equals(other._meterBurst)) {
            return false;
        }
        if (_meterStats == null) {
            if (other._meterStats != null) {
                return false;
            }
        } else if(!_meterStats.equals(other._meterStats)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_meterKbps != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_meterKbps=");
            builder.append(_meterKbps);
         }
        if (_meterPktps != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_meterPktps=");
            builder.append(_meterPktps);
         }
        if (_meterBurst != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_meterBurst=");
            builder.append(_meterBurst);
         }
        if (_meterStats != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_meterStats=");
            builder.append(_meterStats);
         }
        return builder.append(']').toString();
    }



}
