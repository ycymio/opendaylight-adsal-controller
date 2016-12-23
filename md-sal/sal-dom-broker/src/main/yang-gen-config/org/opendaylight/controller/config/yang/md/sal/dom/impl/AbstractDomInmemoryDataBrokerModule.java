/*
* Generated file
*
* Generated from: yang module name: opendaylight-sal-dom-broker-impl yang module local name: dom-inmemory-data-broker
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:39:29 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.md.sal.dom.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-10-28", name = "opendaylight-sal-dom-broker-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:md:sal:dom:impl")

public abstract class AbstractDomInmemoryDataBrokerModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.md.sal.dom.impl.DomInmemoryDataBrokerModuleMXBean,org.opendaylight.controller.config.yang.md.sal.dom.DOMDataBrokerServiceInterface {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.md.sal.dom.impl.AbstractDomInmemoryDataBrokerModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute schemaServiceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("SchemaService");
    private javax.management.ObjectName schemaService; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataBrokerFutureCallbackQueueSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataBrokerFutureCallbackQueueSize");
    private java.lang.Integer maxDataBrokerFutureCallbackQueueSize = new java.lang.Integer("1000");

    public static final org.opendaylight.controller.config.api.JmxAttribute configDataStoreJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("ConfigDataStore");
    private javax.management.ObjectName configDataStore; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute allowConcurrentCommitsJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("AllowConcurrentCommits");
    private java.lang.Boolean allowConcurrentCommits = new java.lang.Boolean("false");

    public static final org.opendaylight.controller.config.api.JmxAttribute operationalDataStoreJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("OperationalDataStore");
    private javax.management.ObjectName operationalDataStore; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataBrokerCommitQueueSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataBrokerCommitQueueSize");
    private java.lang.Integer maxDataBrokerCommitQueueSize = new java.lang.Integer("5000");

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataBrokerFutureCallbackPoolSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataBrokerFutureCallbackPoolSize");
    private java.lang.Integer maxDataBrokerFutureCallbackPoolSize = new java.lang.Integer("20");

    //attributes end

    private final AbstractDomInmemoryDataBrokerModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractDomInmemoryDataBrokerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractDomInmemoryDataBrokerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractDomInmemoryDataBrokerModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    @Override
    public void validate() {

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.core.api.model.SchemaService schemaServiceDependency;
    protected final org.opendaylight.controller.sal.core.api.model.SchemaService getSchemaServiceDependency(){
        return schemaServiceDependency;
    }private org.opendaylight.controller.sal.core.spi.data.DOMStore configDataStoreDependency;
    protected final org.opendaylight.controller.sal.core.spi.data.DOMStore getConfigDataStoreDependency(){
        return configDataStoreDependency;
    }private org.opendaylight.controller.sal.core.spi.data.DOMStore operationalDataStoreDependency;
    protected final org.opendaylight.controller.sal.core.spi.data.DOMStore getOperationalDataStoreDependency(){
        return operationalDataStoreDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            if (operationalDataStore!=null) {
                operationalDataStoreDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.spi.data.DOMStore.class, operationalDataStore, operationalDataStoreJmxAttribute);
            }
            if (configDataStore!=null) {
                configDataStoreDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.spi.data.DOMStore.class, configDataStore, configDataStoreJmxAttribute);
            }
            if (schemaService!=null) {
                schemaServiceDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.api.model.SchemaService.class, schemaService, schemaServiceJmxAttribute);
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

    public boolean canReuseInstance(AbstractDomInmemoryDataBrokerModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractDomInmemoryDataBrokerModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (schemaServiceDependency != other.schemaServiceDependency) { // reference to dependency must be same
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataBrokerFutureCallbackQueueSize, other.maxDataBrokerFutureCallbackQueueSize) == false) {
            return false;
        }
        if (configDataStoreDependency != other.configDataStoreDependency) { // reference to dependency must be same
            return false;
        }
        if (java.util.Objects.deepEquals(allowConcurrentCommits, other.allowConcurrentCommits) == false) {
            return false;
        }
        if (operationalDataStoreDependency != other.operationalDataStoreDependency) { // reference to dependency must be same
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataBrokerCommitQueueSize, other.maxDataBrokerCommitQueueSize) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataBrokerFutureCallbackPoolSize, other.maxDataBrokerFutureCallbackPoolSize) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDomInmemoryDataBrokerModule that = (AbstractDomInmemoryDataBrokerModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getSchemaService() {
        return schemaService;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.dom.SchemaServiceServiceInterface.class)
    public void setSchemaService(javax.management.ObjectName schemaService) {
        this.schemaService = schemaService;
    }

    @Override
    public java.lang.Integer getMaxDataBrokerFutureCallbackQueueSize() {
        return maxDataBrokerFutureCallbackQueueSize;
    }

    /**
    * The maximum queue size for the data broker's commit future callback executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum queue size for the data broker's commit future callback executor.")
    public void setMaxDataBrokerFutureCallbackQueueSize(java.lang.Integer maxDataBrokerFutureCallbackQueueSize) {
        this.maxDataBrokerFutureCallbackQueueSize = maxDataBrokerFutureCallbackQueueSize;
    }

    @Override
    public javax.management.ObjectName getConfigDataStore() {
        return configDataStore;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.core.spi.config_dom_store.DOMStoreServiceInterface.class)
    public void setConfigDataStore(javax.management.ObjectName configDataStore) {
        this.configDataStore = configDataStore;
    }

    @Override
    public java.lang.Boolean getAllowConcurrentCommits() {
        return allowConcurrentCommits;
    }

    /**
    * Specifies whether or not to allow 3-phrase commits to run concurrently.
    *                     Use with caution. If set to true, the data store implementations must be prepared
    *                     to handle concurrent commits. The default is false
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Specifies whether or not to allow 3-phrase commits to run concurrently. Use with caution. If set to true, the data store implementations must be prepared to handle concurrent commits. The default is false")
    public void setAllowConcurrentCommits(java.lang.Boolean allowConcurrentCommits) {
        this.allowConcurrentCommits = allowConcurrentCommits;
    }

    @Override
    public javax.management.ObjectName getOperationalDataStore() {
        return operationalDataStore;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.core.spi.operational_dom_store.DOMStoreServiceInterface.class)
    public void setOperationalDataStore(javax.management.ObjectName operationalDataStore) {
        this.operationalDataStore = operationalDataStore;
    }

    @Override
    public java.lang.Integer getMaxDataBrokerCommitQueueSize() {
        return maxDataBrokerCommitQueueSize;
    }

    /**
    * The maximum queue size for the data broker's commit executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum queue size for the data broker's commit executor.")
    public void setMaxDataBrokerCommitQueueSize(java.lang.Integer maxDataBrokerCommitQueueSize) {
        this.maxDataBrokerCommitQueueSize = maxDataBrokerCommitQueueSize;
    }

    @Override
    public java.lang.Integer getMaxDataBrokerFutureCallbackPoolSize() {
        return maxDataBrokerFutureCallbackPoolSize;
    }

    /**
    * The maximum thread pool size for the data broker's commit future callback executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum thread pool size for the data broker's commit future callback executor.")
    public void setMaxDataBrokerFutureCallbackPoolSize(java.lang.Integer maxDataBrokerFutureCallbackPoolSize) {
        this.maxDataBrokerFutureCallbackPoolSize = maxDataBrokerFutureCallbackPoolSize;
    }

}
