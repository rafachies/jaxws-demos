package org.chies.wsthreadsafe.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * 2013-09-09T16:06:57.724-03:00
 * Generated source version: 2.6.6-redhat-3
 * 
 */
@WebServiceClient(name = "MyService", 
                  wsdlLocation = "http://localhost:8080/wsserver/MyService?wsdl",
                  targetNamespace = "rchies.org") 
public class MyService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("rchies.org", "MyService");
    public final static QName MyServicePosrt = new QName("rchies.org", "MyServicePosrt");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/wsserver/MyService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/wsserver/MyService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServicePosrt")
    public MyService getMyServicePosrt() {
        return super.getPort(MyServicePosrt, MyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServicePosrt")
    public MyService getMyServicePosrt(WebServiceFeature... features) {
        return super.getPort(MyServicePosrt, MyService.class, features);
    }

}
