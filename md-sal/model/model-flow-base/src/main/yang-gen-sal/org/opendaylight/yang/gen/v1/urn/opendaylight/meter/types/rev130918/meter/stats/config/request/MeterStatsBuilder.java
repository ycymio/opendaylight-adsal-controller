package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStatsKey;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats
 */
public class MeterStatsBuilder {

    private MeterStatsKey _key;
    private MeterId _meterId;
    private static List<Range<BigInteger>> _meterId_range;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> augmentation = new HashMap<>();

    public MeterStatsBuilder() {
    } 

    public MeterStatsBuilder(MeterStats base) {
        if (base.getKey() == null) {
            this._key = new MeterStatsKey(
                base.getMeterId()
            );
            this._meterId = base.getMeterId();
        } else {
            this._key = base.getKey();
            this._meterId = _key.getMeterId();
        }
        if (base instanceof MeterStatsImpl) {
            MeterStatsImpl _impl = (MeterStatsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public MeterStatsKey getKey() {
        return _key;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterStatsBuilder setKey(MeterStatsKey value) {
        this._key = value;
        return this;
    }
    
    public MeterStatsBuilder setMeterId(MeterId value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _meterId_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _meterId_range));
            }
        }
        this._meterId = value;
        return this;
    }
    public static List<Range<BigInteger>> _meterId_range() {
        if (_meterId_range == null) {
            synchronized (MeterStatsBuilder.class) {
                if (_meterId_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _meterId_range = builder.build();
                }
            }
        }
        return _meterId_range;
    }
    
    public MeterStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterStats build() {
        return new MeterStatsImpl(this);
    }

    private static final class MeterStatsImpl implements MeterStats {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats.class;
        }

        private final MeterStatsKey _key;
        private final MeterId _meterId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> augmentation = new HashMap<>();

        private MeterStatsImpl(MeterStatsBuilder base) {
            if (base.getKey() == null) {
                this._key = new MeterStatsKey(
                    base.getMeterId()
                );
                this._meterId = base.getMeterId();
            } else {
                this._key = base.getKey();
                this._meterId = _key.getMeterId();
            }
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public MeterStatsKey getKey() {
            return _key;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats)obj;
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_meterId == null) {
                if (other.getMeterId() != null) {
                    return false;
                }
            } else if(!_meterId.equals(other.getMeterId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MeterStatsImpl otherImpl = (MeterStatsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MeterStats [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_meterId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterId=");
                builder.append(_meterId);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
