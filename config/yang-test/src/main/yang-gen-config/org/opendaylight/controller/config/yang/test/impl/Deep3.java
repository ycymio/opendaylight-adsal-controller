package org.opendaylight.controller.config.yang.test.impl;
public class Deep3 {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Boolean boool;

    public Deep3 () {
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
