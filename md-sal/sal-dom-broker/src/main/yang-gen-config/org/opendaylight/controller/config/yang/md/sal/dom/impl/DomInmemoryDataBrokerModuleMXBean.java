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
public interface DomInmemoryDataBrokerModuleMXBean {
    public javax.management.ObjectName getSchemaService();

    public void setSchemaService(javax.management.ObjectName schemaService);

    public java.lang.Integer getMaxDataBrokerFutureCallbackQueueSize();

    /**
    * The maximum queue size for the data broker's commit future callback executor.
    */
    public void setMaxDataBrokerFutureCallbackQueueSize(java.lang.Integer maxDataBrokerFutureCallbackQueueSize);

    public javax.management.ObjectName getConfigDataStore();

    public void setConfigDataStore(javax.management.ObjectName configDataStore);

    public java.lang.Boolean getAllowConcurrentCommits();

    /**
    * Specifies whether or not to allow 3-phrase commits to run concurrently.
    *                     Use with caution. If set to true, the data store implementations must be prepared
    *                     to handle concurrent commits. The default is false
    */
    public void setAllowConcurrentCommits(java.lang.Boolean allowConcurrentCommits);

    public javax.management.ObjectName getOperationalDataStore();

    public void setOperationalDataStore(javax.management.ObjectName operationalDataStore);

    public java.lang.Integer getMaxDataBrokerCommitQueueSize();

    /**
    * The maximum queue size for the data broker's commit executor.
    */
    public void setMaxDataBrokerCommitQueueSize(java.lang.Integer maxDataBrokerCommitQueueSize);

    public java.lang.Integer getMaxDataBrokerFutureCallbackPoolSize();

    /**
    * The maximum thread pool size for the data broker's commit future callback executor.
    */
    public void setMaxDataBrokerFutureCallbackPoolSize(java.lang.Integer maxDataBrokerFutureCallbackPoolSize);

}
