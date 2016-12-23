/*
* Generated file
*
* Generated from: yang module name: distributed-datastore-provider yang module local name: distributed-config-datastore-provider
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:39:27 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.distributed_datastore_provider;
public class ConfigProperties {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type boundedMailboxCapacity = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("1000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardLeaderElectionTimeoutInSeconds = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("30"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardSnapshotBatchCount = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("20000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage shardSnapshotDataThresholdPercentage = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage(new java.lang.Short("12"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardJournalRecoveryLogBatchSize = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("5000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType shardHearbeatIntervalInMillis = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType(new java.lang.Integer("500"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionCommitTimeoutInSeconds = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("30"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionIdleTimeoutInMinutes = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("10"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeExecutorQueueSize = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("1000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeExecutorPoolSize = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("20"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeListenerQueueSize = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("1000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataStoreExecutorQueueSize = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("5000"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType shardIsolatedLeaderCheckIntervalInMillis = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType(new java.lang.Integer("5000"));

    private java.lang.Boolean enableMetricCapture = new java.lang.Boolean("false");

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardInitializationTimeoutInSeconds = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("300"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType operationTimeoutInSeconds = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType(new java.lang.Integer("5"));

    private org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionCommitQueueCapacity = new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type(new java.lang.Long("20000"));

    private java.lang.Boolean persistent = new java.lang.Boolean("true");

    public ConfigProperties () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getBoundedMailboxCapacity() {
        return boundedMailboxCapacity;
    }

    public void setBoundedMailboxCapacity(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type boundedMailboxCapacity) {
        this.boundedMailboxCapacity = boundedMailboxCapacity;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardLeaderElectionTimeoutInSeconds() {
        return shardLeaderElectionTimeoutInSeconds;
    }

    public void setShardLeaderElectionTimeoutInSeconds(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardLeaderElectionTimeoutInSeconds) {
        this.shardLeaderElectionTimeoutInSeconds = shardLeaderElectionTimeoutInSeconds;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardSnapshotBatchCount() {
        return shardSnapshotBatchCount;
    }

    public void setShardSnapshotBatchCount(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardSnapshotBatchCount) {
        this.shardSnapshotBatchCount = shardSnapshotBatchCount;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage getShardSnapshotDataThresholdPercentage() {
        return shardSnapshotDataThresholdPercentage;
    }

    public void setShardSnapshotDataThresholdPercentage(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.Percentage shardSnapshotDataThresholdPercentage) {
        this.shardSnapshotDataThresholdPercentage = shardSnapshotDataThresholdPercentage;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardJournalRecoveryLogBatchSize() {
        return shardJournalRecoveryLogBatchSize;
    }

    public void setShardJournalRecoveryLogBatchSize(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardJournalRecoveryLogBatchSize) {
        this.shardJournalRecoveryLogBatchSize = shardJournalRecoveryLogBatchSize;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType getShardHearbeatIntervalInMillis() {
        return shardHearbeatIntervalInMillis;
    }

    public void setShardHearbeatIntervalInMillis(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType shardHearbeatIntervalInMillis) {
        this.shardHearbeatIntervalInMillis = shardHearbeatIntervalInMillis;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardTransactionCommitTimeoutInSeconds() {
        return shardTransactionCommitTimeoutInSeconds;
    }

    public void setShardTransactionCommitTimeoutInSeconds(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionCommitTimeoutInSeconds) {
        this.shardTransactionCommitTimeoutInSeconds = shardTransactionCommitTimeoutInSeconds;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardTransactionIdleTimeoutInMinutes() {
        return shardTransactionIdleTimeoutInMinutes;
    }

    public void setShardTransactionIdleTimeoutInMinutes(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionIdleTimeoutInMinutes) {
        this.shardTransactionIdleTimeoutInMinutes = shardTransactionIdleTimeoutInMinutes;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getMaxShardDataChangeExecutorQueueSize() {
        return maxShardDataChangeExecutorQueueSize;
    }

    public void setMaxShardDataChangeExecutorQueueSize(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeExecutorQueueSize) {
        this.maxShardDataChangeExecutorQueueSize = maxShardDataChangeExecutorQueueSize;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getMaxShardDataChangeExecutorPoolSize() {
        return maxShardDataChangeExecutorPoolSize;
    }

    public void setMaxShardDataChangeExecutorPoolSize(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeExecutorPoolSize) {
        this.maxShardDataChangeExecutorPoolSize = maxShardDataChangeExecutorPoolSize;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getMaxShardDataChangeListenerQueueSize() {
        return maxShardDataChangeListenerQueueSize;
    }

    public void setMaxShardDataChangeListenerQueueSize(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataChangeListenerQueueSize) {
        this.maxShardDataChangeListenerQueueSize = maxShardDataChangeListenerQueueSize;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getMaxShardDataStoreExecutorQueueSize() {
        return maxShardDataStoreExecutorQueueSize;
    }

    public void setMaxShardDataStoreExecutorQueueSize(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type maxShardDataStoreExecutorQueueSize) {
        this.maxShardDataStoreExecutorQueueSize = maxShardDataStoreExecutorQueueSize;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType getShardIsolatedLeaderCheckIntervalInMillis() {
        return shardIsolatedLeaderCheckIntervalInMillis;
    }

    public void setShardIsolatedLeaderCheckIntervalInMillis(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.HeartbeatIntervalType shardIsolatedLeaderCheckIntervalInMillis) {
        this.shardIsolatedLeaderCheckIntervalInMillis = shardIsolatedLeaderCheckIntervalInMillis;
    }

    public java.lang.Boolean getEnableMetricCapture() {
        return enableMetricCapture;
    }

    public void setEnableMetricCapture(java.lang.Boolean enableMetricCapture) {
        this.enableMetricCapture = enableMetricCapture;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardInitializationTimeoutInSeconds() {
        return shardInitializationTimeoutInSeconds;
    }

    public void setShardInitializationTimeoutInSeconds(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardInitializationTimeoutInSeconds) {
        this.shardInitializationTimeoutInSeconds = shardInitializationTimeoutInSeconds;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType getOperationTimeoutInSeconds() {
        return operationTimeoutInSeconds;
    }

    public void setOperationTimeoutInSeconds(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.OperationTimeoutType operationTimeoutInSeconds) {
        this.operationTimeoutInSeconds = operationTimeoutInSeconds;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type getShardTransactionCommitQueueCapacity() {
        return shardTransactionCommitQueueCapacity;
    }

    public void setShardTransactionCommitQueueCapacity(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.distributed.datastore.provider.rev140612.NonZeroUint32Type shardTransactionCommitQueueCapacity) {
        this.shardTransactionCommitQueueCapacity = shardTransactionCommitQueueCapacity;
    }

    public java.lang.Boolean getPersistent() {
        return persistent;
    }

    public void setPersistent(java.lang.Boolean persistent) {
        this.persistent = persistent;
    }

}
