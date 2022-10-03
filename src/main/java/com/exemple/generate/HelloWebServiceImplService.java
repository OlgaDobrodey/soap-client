
package com.exemple.generate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWebServiceImplService", targetNamespace = "http://server.dobrodey.ru/", wsdlLocation = "http://localhost:8081/wss/first?wsdl")
public class HelloWebServiceImplService
    extends Service
{

    private final static URL HELLOWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HELLOWEBSERVICEIMPLSERVICE_QNAME = new QName("http://server.dobrodey.ru/", "HelloWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/wss/first?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HELLOWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HelloWebServiceImplService() {
        super(__getWsdlLocation(), HELLOWEBSERVICEIMPLSERVICE_QNAME);
    }

    public HelloWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWEBSERVICEIMPLSERVICE_QNAME);
    }

    public HelloWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public HelloWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWebServiceImplPort")
    public HelloWebService getHelloWebServiceImplPort() {
        return super.getPort(new QName("http://server.dobrodey.ru/", "HelloWebServiceImplPort"), HelloWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWebServiceImplPort")
    public HelloWebService getHelloWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.dobrodey.ru/", "HelloWebServiceImplPort"), HelloWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HELLOWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
