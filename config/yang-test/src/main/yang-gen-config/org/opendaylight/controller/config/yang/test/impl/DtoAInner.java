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
public class DtoAInner {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Long simpleArg;

    private org.opendaylight.controller.config.yang.test.impl.DtoAInnerInner dtoAInnerInner;

    public DtoAInner () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Long getSimpleArg() {
        return simpleArg;
    }

    public void setSimpleArg(java.lang.Long simpleArg) {
        this.simpleArg = simpleArg;
    }

    public org.opendaylight.controller.config.yang.test.impl.DtoAInnerInner getDtoAInnerInner() {
        return dtoAInnerInner;
    }

    public void setDtoAInnerInner(org.opendaylight.controller.config.yang.test.impl.DtoAInnerInner dtoAInnerInner) {
        this.dtoAInnerInner = dtoAInnerInner;
    }

}
