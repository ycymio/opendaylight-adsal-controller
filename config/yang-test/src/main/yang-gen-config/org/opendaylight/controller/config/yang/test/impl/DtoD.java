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
public class DtoD {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.util.List<org.opendaylight.controller.config.yang.test.impl.ComplexDtoBInner> complexDtoBInner;

    private java.lang.Long simpleInt2;

    private java.lang.Long simpleInt1;

    private java.lang.Integer simpleInt3;

    private java.util.List<java.lang.Integer> simpleList;

    public DtoD () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.util.List<org.opendaylight.controller.config.yang.test.impl.ComplexDtoBInner> getComplexDtoBInner() {
        return complexDtoBInner;
    }

    public void setComplexDtoBInner(java.util.List<org.opendaylight.controller.config.yang.test.impl.ComplexDtoBInner> complexDtoBInner) {
        this.complexDtoBInner = complexDtoBInner;
    }

    public java.lang.Long getSimpleInt2() {
        return simpleInt2;
    }

    public void setSimpleInt2(java.lang.Long simpleInt2) {
        this.simpleInt2 = simpleInt2;
    }

    public java.lang.Long getSimpleInt1() {
        return simpleInt1;
    }

    public void setSimpleInt1(java.lang.Long simpleInt1) {
        this.simpleInt1 = simpleInt1;
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

}