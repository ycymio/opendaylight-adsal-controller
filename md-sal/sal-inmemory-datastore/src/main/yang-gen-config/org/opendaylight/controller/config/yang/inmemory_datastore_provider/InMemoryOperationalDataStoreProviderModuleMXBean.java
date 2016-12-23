/*
* Generated file
*
* Generated from: yang module name: opendaylight-inmemory-datastore-provider yang module local name: inmemory-operational-datastore-provider
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:39:22 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.inmemory_datastore_provider;
public interface InMemoryOperationalDataStoreProviderModuleMXBean {
    public java.lang.Integer getMaxDataStoreExecutorQueueSize();

    /**
    * The maximum queue size for the data store executor.
    */
    public void setMaxDataStoreExecutorQueueSize(java.lang.Integer maxDataStoreExecutorQueueSize);

    public javax.management.ObjectName getSchemaService();

    public void setSchemaService(javax.management.ObjectName schemaService);

    public java.lang.Boolean getDebugTransactions();

    /**
    * Enable transaction lifecycle debugging.
    */
    public void setDebugTransactions(java.lang.Boolean debugTransactions);

    public java.lang.Integer getMaxDataChangeExecutorQueueSize();

    /**
    * The maximum queue size for the data change notification executor.
    */
    public void setMaxDataChangeExecutorQueueSize(java.lang.Integer maxDataChangeExecutorQueueSize);

    public java.lang.Integer getMaxDataChangeExecutorPoolSize();

    /**
    * The maximum thread pool size for the data change notification executor.
    */
    public void setMaxDataChangeExecutorPoolSize(java.lang.Integer maxDataChangeExecutorPoolSize);

    public java.lang.Integer getMaxDataChangeListenerQueueSize();

    /**
    * The maximum queue size for the data change listeners.
    */
    public void setMaxDataChangeListenerQueueSize(java.lang.Integer maxDataChangeListenerQueueSize);

}
