package org.opendaylight.controller.config.yang.test.impl;
public class Deep2 {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Boolean boool;

    public Deep2 () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Boolean getBoool() {
        return boool;
    }

    public void setBoool(java.lang.Boolean boool) {
        this.boool = boool;
    }

}
