/*
* Generated file
*
* Generated from: yang module name: config-logging yang module local name: logback
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:38:26 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.logback.config;
public class RollingFileAppenderTO {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.String name;

    private java.lang.Boolean cleanHistoryOnStart = new java.lang.Boolean("false");

    private java.lang.Integer maxHistory;

    private java.lang.String fileName;

    private java.lang.String encoderPattern;

    private java.lang.String rollingPolicyType;

    private java.lang.Boolean append;

    private java.lang.Integer maxIndex;

    private java.lang.Integer minIndex;

    private java.lang.String fileNamePattern;

    private java.lang.String maxFileSize;

    public RollingFileAppenderTO () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Boolean getCleanHistoryOnStart() {
        return cleanHistoryOnStart;
    }

    public void setCleanHistoryOnStart(java.lang.Boolean cleanHistoryOnStart) {
        this.cleanHistoryOnStart = cleanHistoryOnStart;
    }

    public java.lang.Integer getMaxHistory() {
        return maxHistory;
    }

    public void setMaxHistory(java.lang.Integer maxHistory) {
        this.maxHistory = maxHistory;
    }

    public java.lang.String getFileName() {
        return fileName;
    }

    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }

    public java.lang.String getEncoderPattern() {
        return encoderPattern;
    }

    public void setEncoderPattern(java.lang.String encoderPattern) {
        this.encoderPattern = encoderPattern;
    }

    public java.lang.String getRollingPolicyType() {
        return rollingPolicyType;
    }

    public void setRollingPolicyType(java.lang.String rollingPolicyType) {
        this.rollingPolicyType = rollingPolicyType;
    }

    public java.lang.Boolean getAppend() {
        return append;
    }

    public void setAppend(java.lang.Boolean append) {
        this.append = append;
    }

    public java.lang.Integer getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(java.lang.Integer maxIndex) {
        this.maxIndex = maxIndex;
    }

    public java.lang.Integer getMinIndex() {
        return minIndex;
    }

    public void setMinIndex(java.lang.Integer minIndex) {
        this.minIndex = minIndex;
    }

    public java.lang.String getFileNamePattern() {
        return fileNamePattern;
    }

    public void setFileNamePattern(java.lang.String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
    }

    public java.lang.String getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(java.lang.String maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

}