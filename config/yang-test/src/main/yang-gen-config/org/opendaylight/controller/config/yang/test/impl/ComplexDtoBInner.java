/*
* Generated file
*
* Generated from: yang module name: config-test-impl yang module local name: impl-netconf
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:41:27 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.test.impl;
public class ComplexDtoBInner {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Integer simpleInt3;

    private java.util.List<java.lang.Integer> simpleList;

    private org.opendaylight.controller.config.yang.test.impl.Deep deep;

    public ComplexDtoBInner () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Integer getSimpleInt3() {
        return simpleInt3;
    }

    public void setSimpleInt3(java.lang.Integer simpleInt3) {
        this.simpleInt3 = simpleInt3;
    }

    public java.util.List<java.lang.Integer> getSimpleList() {
        return simpleList;
    }

    public void setSimpleList(java.util.List<java.lang.Integer> simpleList) {
        this.simpleList = simpleList;
    }

    public org.opendaylight.controller.config.yang.test.impl.Deep getDeep() {
        return deep;
    }

    public void setDeep(org.opendaylight.controller.config.yang.test.impl.Deep deep) {
        this.deep = deep;
    }

}
