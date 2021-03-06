package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.threadpool.rev130409;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceType;


/**
 * A simple pool of threads able to execute work.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>threadpool</b>
 * <br />(Source path: <i>META-INF\yang\threadpool.yang</i>):
 * <pre>
 * identity threadpool {
 *     base "()IdentitySchemaNodeImpl[base=null, qname=(urn:opendaylight:params:xml:ns:yang:controller:config?revision=2013-04-05)service-type]";
 *     description
 *         "A simple pool of threads able to execute work.";
 *     status CURRENT;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>threadpool/threadpool</i>
 */
public abstract class Threadpool extends ServiceType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:threadpool","2013-04-09","threadpool");;

    public Threadpool() {
    
    
    }
    








}
