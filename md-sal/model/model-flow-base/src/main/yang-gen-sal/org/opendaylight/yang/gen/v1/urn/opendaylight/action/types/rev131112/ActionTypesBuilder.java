package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes
 */
public class ActionTypesBuilder {

    private List<Action> _action;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> augmentation = new HashMap<>();

    public ActionTypesBuilder() {
    } 
    
    public ActionTypesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList arg) {
        this._action = arg.getAction();
    }

    public ActionTypesBuilder(ActionTypes base) {
        this._action = base.getAction();
        if (base instanceof ActionTypesImpl) {
            ActionTypesImpl _impl = (ActionTypesImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList) {
            this._action = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList)arg).getAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Action> getAction() {
        return _action;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ActionTypesBuilder setAction(List<Action> value) {
        this._action = value;
        return this;
    }
    
    public ActionTypesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ActionTypes build() {
        return new ActionTypesImpl(this);
    }

    private static final class ActionTypesImpl implements ActionTypes {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes.class;
        }

        private final List<Action> _action;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> augmentation = new HashMap<>();

        private ActionTypesImpl(ActionTypesBuilder base) {
            this._action = base.getAction();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public List<Action> getAction() {
            return _action;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes other = (org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes)obj;
            if (_action == null) {
                if (other.getAction() != null) {
                    return false;
                }
            } else if(!_action.equals(other.getAction())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionTypesImpl otherImpl = (ActionTypesImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionTypes>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ActionTypes [");
            boolean first = true;
        
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
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
