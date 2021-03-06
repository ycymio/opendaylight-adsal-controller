/*
* Generated file
*
* Generated from: yang module name: config-test-impl yang module local name: impl-identity-test
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:41:27 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.test.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-04-03", name = "config-test-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:test:impl")

public abstract class AbstractIdentityTestModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.test.impl.IdentityTestModuleMXBean,org.opendaylight.controller.config.yang.test.AutoCloseableServiceInterface,org.opendaylight.controller.config.api.RuntimeBeanRegistratorAwareModule {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.test.impl.AbstractIdentityTestModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute identitiesContainerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("IdentitiesContainer");
    private org.opendaylight.controller.config.yang.test.impl.IdentitiesContainer identitiesContainer;

    public static final org.opendaylight.controller.config.api.JmxAttribute identitiesJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Identities");
    private java.util.List<org.opendaylight.controller.config.yang.test.impl.Identities> identities = new java.util.ArrayList<org.opendaylight.controller.config.yang.test.impl.Identities>();

    public static final org.opendaylight.controller.config.api.JmxAttribute afiJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Afi");
    private org.opendaylight.controller.config.api.IdentityAttributeRef afi;

    //attributes end

    private final AbstractIdentityTestModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractIdentityTestModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractIdentityTestModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractIdentityTestModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    private org.opendaylight.controller.config.yang.test.impl.IdentityTestRuntimeRegistrator rootRuntimeBeanRegistratorWrapper;

    public org.opendaylight.controller.config.yang.test.impl.IdentityTestRuntimeRegistrator getRootRuntimeBeanRegistratorWrapper(){
        return rootRuntimeBeanRegistratorWrapper;
    }

    @Override
    public void setRuntimeBeanRegistrator(org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeRegistrator){
        this.rootRuntimeBeanRegistratorWrapper = new org.opendaylight.controller.config.yang.test.impl.IdentityTestRuntimeRegistrator(rootRuntimeRegistrator);
    }

    @Override
    public void validate() {

        customValidation();
    }

    protected void customValidation() {
    }

    private java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.TestIdentity1> afiIdentityClass;

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            if (identitiesContainer!=null){
                identitiesContainer.injectDependencyResolver(dependencyResolver);
            }
            if (identities!=null){
                for(org.opendaylight.controller.config.yang.test.impl.Identities candidate : identities) {
                    candidate.injectDependencyResolver(dependencyResolver);
                }
            }
        if (afi!=null) {setAfi(afi.resolveIdentity(dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.TestIdentity1.class));}
            if(oldInstance!=null && canReuseInstance(oldModule)) {
                instance = reuseInstance(oldInstance);
            } else {
                if(oldInstance!=null) {
                    try {
                        oldInstance.close();
                    } catch(Exception e) {
                        logger.error("An error occurred while closing old instance " + oldInstance, e);
                    }
                }
                instance = createInstance();
                if (instance == null) {
                    throw new IllegalStateException("Error in createInstance - null is not allowed as return value");
                }
            }
        }
        return instance;
    }
    public abstract java.lang.AutoCloseable createInstance();

    public boolean canReuseInstance(AbstractIdentityTestModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractIdentityTestModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(identitiesContainer, other.identitiesContainer) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(identities, other.identities) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(afi, other.afi) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractIdentityTestModule that = (AbstractIdentityTestModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public org.opendaylight.controller.config.yang.test.impl.IdentitiesContainer getIdentitiesContainer() {
        return identitiesContainer;
    }

    @Override
    public void setIdentitiesContainer(org.opendaylight.controller.config.yang.test.impl.IdentitiesContainer identitiesContainer) {
        this.identitiesContainer = identitiesContainer;
    }

    @Override
    public java.util.List<org.opendaylight.controller.config.yang.test.impl.Identities> getIdentities() {
        return identities;
    }

    @Override
    public void setIdentities(java.util.List<org.opendaylight.controller.config.yang.test.impl.Identities> identities) {
        this.identities = identities;
    }

    public java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.TestIdentity1> getAfiIdentity() {
        return afiIdentityClass;
    }

    public void setAfi(java.lang.Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.TestIdentity1> afiIdentityClass) {
        this.afiIdentityClass = afiIdentityClass;
    }

    @Override
    public org.opendaylight.controller.config.api.IdentityAttributeRef getAfi() {
        return afi;
    }

    @Override
    public void setAfi(org.opendaylight.controller.config.api.IdentityAttributeRef afi) {
        this.afi = afi;
    }

}
