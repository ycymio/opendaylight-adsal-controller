/*
* Generated file
*
* Generated from: yang module name: opendaylight-inmemory-datastore-provider yang module local name: inmemory-config-datastore-provider
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:39:22 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.inmemory_datastore_provider;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-06-17", name = "opendaylight-inmemory-datastore-provider", namespace = "urn:opendaylight:params:xml:ns:yang:controller:inmemory-datastore-provider")

public abstract class AbstractInMemoryConfigDataStoreProviderModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.inmemory_datastore_provider.InMemoryConfigDataStoreProviderModuleMXBean,org.opendaylight.controller.config.yang.md.sal.core.spi.config_dom_store.DOMStoreServiceInterface {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.inmemory_datastore_provider.AbstractInMemoryConfigDataStoreProviderModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataStoreExecutorQueueSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataStoreExecutorQueueSize");
    private java.lang.Integer maxDataStoreExecutorQueueSize = new java.lang.Integer("5000");

    public static final org.opendaylight.controller.config.api.JmxAttribute schemaServiceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("SchemaService");
    private javax.management.ObjectName schemaService; // optional

    public static final org.opendaylight.controller.config.api.JmxAttribute debugTransactionsJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DebugTransactions");
    private java.lang.Boolean debugTransactions = new java.lang.Boolean("false");

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataChangeExecutorQueueSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataChangeExecutorQueueSize");
    private java.lang.Integer maxDataChangeExecutorQueueSize = new java.lang.Integer("1000");

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataChangeExecutorPoolSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataChangeExecutorPoolSize");
    private java.lang.Integer maxDataChangeExecutorPoolSize = new java.lang.Integer("20");

    public static final org.opendaylight.controller.config.api.JmxAttribute maxDataChangeListenerQueueSizeJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MaxDataChangeListenerQueueSize");
    private java.lang.Integer maxDataChangeListenerQueueSize = new java.lang.Integer("1000");

    //attributes end

    private final AbstractInMemoryConfigDataStoreProviderModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractInMemoryConfigDataStoreProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractInMemoryConfigDataStoreProviderModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractInMemoryConfigDataStoreProviderModule oldModule,java.lang.AutoCloseable oldInstance) {
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
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
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

    public boolean canReuseInstance(AbstractInMemoryConfigDataStoreProviderModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractInMemoryConfigDataStoreProviderModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (java.util.Objects.deepEquals(maxDataStoreExecutorQueueSize, other.maxDataStoreExecutorQueueSize) == false) {
            return false;
        }
        if (schemaServiceDependency != other.schemaServiceDependency) { // reference to dependency must be same
            return false;
        }
        if (java.util.Objects.deepEquals(debugTransactions, other.debugTransactions) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataChangeExecutorQueueSize, other.maxDataChangeExecutorQueueSize) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataChangeExecutorPoolSize, other.maxDataChangeExecutorPoolSize) == false) {
            return false;
        }
        if (java.util.Objects.deepEquals(maxDataChangeListenerQueueSize, other.maxDataChangeListenerQueueSize) == false) {
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractInMemoryConfigDataStoreProviderModule that = (AbstractInMemoryConfigDataStoreProviderModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public java.lang.Integer getMaxDataStoreExecutorQueueSize() {
        return maxDataStoreExecutorQueueSize;
    }

    /**
    * The maximum queue size for the data store executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum queue size for the data store executor.")
    public void setMaxDataStoreExecutorQueueSize(java.lang.Integer maxDataStoreExecutorQueueSize) {
        this.maxDataStoreExecutorQueueSize = maxDataStoreExecutorQueueSize;
    }

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
    public java.lang.Boolean getDebugTransactions() {
        return debugTransactions;
    }

    /**
    * Enable transaction lifecycle debugging.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "Enable transaction lifecycle debugging.")
    public void setDebugTransactions(java.lang.Boolean debugTransactions) {
        this.debugTransactions = debugTransactions;
    }

    @Override
    public java.lang.Integer getMaxDataChangeExecutorQueueSize() {
        return maxDataChangeExecutorQueueSize;
    }

    /**
    * The maximum queue size for the data change notification executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum queue size for the data change notification executor.")
    public void setMaxDataChangeExecutorQueueSize(java.lang.Integer maxDataChangeExecutorQueueSize) {
        this.maxDataChangeExecutorQueueSize = maxDataChangeExecutorQueueSize;
    }

    @Override
    public java.lang.Integer getMaxDataChangeExecutorPoolSize() {
        return maxDataChangeExecutorPoolSize;
    }

    /**
    * The maximum thread pool size for the data change notification executor.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum thread pool size for the data change notification executor.")
    public void setMaxDataChangeExecutorPoolSize(java.lang.Integer maxDataChangeExecutorPoolSize) {
        this.maxDataChangeExecutorPoolSize = maxDataChangeExecutorPoolSize;
    }

    @Override
    public java.lang.Integer getMaxDataChangeListenerQueueSize() {
        return maxDataChangeListenerQueueSize;
    }

    /**
    * The maximum queue size for the data change listeners.
    */
    @Override
    @org.opendaylight.controller.config.api.annotations.Description(value = "The maximum queue size for the data change listeners.")
    public void setMaxDataChangeListenerQueueSize(java.lang.Integer maxDataChangeListenerQueueSize) {
        this.maxDataChangeListenerQueueSize = maxDataChangeListenerQueueSize;
    }

}
