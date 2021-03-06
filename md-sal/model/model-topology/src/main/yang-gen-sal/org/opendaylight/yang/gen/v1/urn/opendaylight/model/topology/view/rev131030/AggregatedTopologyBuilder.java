package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology
 */
public class AggregatedTopologyBuilder {

    private List<TopologyId> _originalTopology;


    public AggregatedTopologyBuilder() {
    } 
    
    public AggregatedTopologyBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology arg) {
        this._originalTopology = arg.getOriginalTopology();
    }

    public AggregatedTopologyBuilder(AggregatedTopology base) {
        this._originalTopology = base.getOriginalTopology();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology) {
            this._originalTopology = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology)arg).getOriginalTopology();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateTopology] \n" +
              "but was: " + arg
            );
        }
    }

    public List<TopologyId> getOriginalTopology() {
        return _originalTopology;
    }

    public AggregatedTopologyBuilder setOriginalTopology(List<TopologyId> value) {
        this._originalTopology = value;
        return this;
    }

    public AggregatedTopology build() {
        return new AggregatedTopologyImpl(this);
    }

    private static final class AggregatedTopologyImpl implements AggregatedTopology {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology.class;
        }

        private final List<TopologyId> _originalTopology;


        private AggregatedTopologyImpl(AggregatedTopologyBuilder base) {
            this._originalTopology = base.getOriginalTopology();
        }

        @Override
        public List<TopologyId> getOriginalTopology() {
            return _originalTopology;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_originalTopology == null) ? 0 : _originalTopology.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology other = (org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregatedTopology)obj;
            if (_originalTopology == null) {
                if (other.getOriginalTopology() != null) {
                    return false;
                }
            } else if(!_originalTopology.equals(other.getOriginalTopology())) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AggregatedTopology [");
            boolean first = true;
        
            if (_originalTopology != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalTopology=");
                builder.append(_originalTopology);
             }
            return builder.append(']').toString();
        }
    }

}
