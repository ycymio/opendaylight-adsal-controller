package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.netty.rev131119;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType;


/**
 * Configuration wrapper around netty's event executor
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>netty</b>
 * <br />(Source path: <i>META-INF\yang\netty.yang</i>):
 * <pre>
 * identity netty-event-executor {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)service-type]";
 *     description
 *         "Configuration wrapper around netty's event executor";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>netty/netty-event-executor</i>
 */
public abstract class NettyEventExecutor extends ServiceType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:netty","2013-11-19","netty-event-executor");;

    public NettyEventExecutor() {
    
    
    }
    








}
