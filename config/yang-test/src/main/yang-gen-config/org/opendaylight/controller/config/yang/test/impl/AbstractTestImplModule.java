/*
* Generated file
*
* Generated from: yang module name: config-test-impl yang module local name: impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:41:27 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.test.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-04-03", name = "config-test-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:test:impl")

public abstract class AbstractTestImplModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.test.impl.TestImplModuleMXBean,org.opendaylight.controller.config.yang.test.AutoCloseableServiceInterface,org.opendaylight.controller.config.api.RuntimeBeanRegistratorAwareModule {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.test.impl.AbstractTestImplModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute asNumberJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("AsNumber");
    private org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber asNumber = new org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber(new java.lang.Long("44"));

    public static final org.opendaylight.controller.config.api.JmxAttribute dtoAJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DtoA");
    private org.opendaylight.controller.config.yang.test.impl.DtoA dtoA;

    public static final org.opendaylight.controller.config.api.JmxAttribute dtoBJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DtoB");
    private org.opendaylight.controller.config.yang.test.impl.DtoB dtoB;

    public static final org.opendaylight.controller.config.api.JmxAttribute simpleIntJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("SimpleInt");
    private java.lang.Long simpleInt = new java.lang.Long("99");

    public static final org.opendaylight.controller.config.api.JmxAttribute allowUserJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("AllowUser");
    private java.util.List<java.lang.String> allowUser = new java.util.ArrayList<java.lang.String>();

    //attributes end

    private final AbstractTestImplModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractTestImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractTestImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractTestImplModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    private org.opendaylight.controller.config.yang.test.impl.TestImplRuntimeRegistrator rootRuntimeBeanRegistratorWrapper;

    public org.opendaylight.controller.config.yang.test.impl.TestImplRuntimeRegistrator getRootRuntimeBeanRegistratorWrapper(){
        return rootRuntimeBeanRegistratorWrapper;
    }

    @Override
    public void setRuntimeBeanRegistrator(org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeRegistrator){
        this.rootRuntimeBeanRegistratorWrapper = new org.opendaylight.controller.config.yang.test.impl.TestImplRuntimeRegistrator(rootRuntimeRegistrator);
    }

    @Override
    public void validate() {

        customValidation();
    }

    protected void customValidation() {
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            if (dtoA!=null){
                dtoA.injectDependencyResolver(dependencyResolver);
            }
            if (dtoB!=null){
                dtoB.injectDependencyResolver(dependencyResolver);
            }
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

    public boolean canReuseInstance(AbstractTestImplModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractTestImplModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(asNumber, other.asNumber) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(dtoA, other.dtoA) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(dtoB, other.dtoB) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(simpleInt, other.simpleInt) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(allowUser, other.allowUser) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractTestImplModule that = (AbstractTestImplModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber getAsNumber() {
        return asNumber;
    }

    @Override
    public void setAsNumber(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.AsNumber asNumber) {
        this.asNumber = asNumber;
    }

    @Override
    public org.opendaylight.controller.config.yang.test.impl.DtoA getDtoA() {
        return dtoA;
    }

    @Override
    public void setDtoA(org.opendaylight.controller.config.yang.test.impl.DtoA dtoA) {
        this.dtoA = dtoA;
    }

    @Override
    public org.opendaylight.controller.config.yang.test.impl.DtoB getDtoB() {
        return dtoB;
    }

    @Override
    public void setDtoB(org.opendaylight.controller.config.yang.test.impl.DtoB dtoB) {
        this.dtoB = dtoB;
    }

    @Override
    public java.lang.Long getSimpleInt() {
        return simpleInt;
    }

    @Override
    public void setSimpleInt(java.lang.Long simpleInt) {
        this.simpleInt = simpleInt;
    }

    @Override
    public java.util.List<java.lang.String> getAllowUser() {
        return allowUser;
    }

    /**
    * A list of user name patterns to allow
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "A list of user name patterns to allow")
    public void setAllowUser(java.util.List<java.lang.String> allowUser) {
        this.allowUser = allowUser;
    }

}
