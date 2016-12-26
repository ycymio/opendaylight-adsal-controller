/*
* Generated file
*
* Generated from: yang module name: threadpool yang module local name: scheduled-threadpool
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Sat Aug 08 09:39:58 CST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.threadpool;
/**
* An extension of the simple pool of threads able to schedule
*              work to be executed at some point in time.
*/
@org.opendaylight.controller.config.api.annotations.Description(value = "An extension of the simple pool of threads able to schedule work to be executed at some point in time.")

@org.opendaylight.controller.config.api.annotations.ServiceInterfaceAnnotation(value = "(urn:opendaylight:params:xml:ns:yang:controller:threadpool?revision=2013-04-09)scheduled-threadpool", osgiRegistrationType = org.opendaylight.controller.config.threadpool.ScheduledThreadPool.class, namespace = "urn:opendaylight:params:xml:ns:yang:controller:threadpool", revision = "2013-04-09", localName = "scheduled-threadpool")

@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(namespace = "urn:opendaylight:params:xml:ns:yang:controller:threadpool", revision = "2013-04-09", name = "threadpool")

public interface ScheduledThreadPoolServiceInterface extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface,org.opendaylight.controller.config.yang.threadpool.ThreadPoolServiceInterface {

}