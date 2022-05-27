
package service;

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
@WebServiceClient(name = "TaddressServiceImplService", targetNamespace = "http://addressService.service.clinicawebservice.com/", wsdlLocation = "http://192.168.137.1:7001/TaddressServiceImpl/TaddressServiceImplService?WSDL")
public class TaddressServiceImplService
    extends Service
{

    private final static URL TADDRESSSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TADDRESSSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName TADDRESSSERVICEIMPLSERVICE_QNAME = new QName("http://addressService.service.clinicawebservice.com/", "TaddressServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.137.1:7001/TaddressServiceImpl/TaddressServiceImplService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TADDRESSSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        TADDRESSSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public TaddressServiceImplService() {
        super(__getWsdlLocation(), TADDRESSSERVICEIMPLSERVICE_QNAME);
    }

    public TaddressServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TADDRESSSERVICEIMPLSERVICE_QNAME, features);
    }

    public TaddressServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, TADDRESSSERVICEIMPLSERVICE_QNAME);
    }

    public TaddressServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TADDRESSSERVICEIMPLSERVICE_QNAME, features);
    }

    public TaddressServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaddressServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TaddressService
     */
    @WebEndpoint(name = "TaddressServiceImplPort")
    public TaddressService getTaddressServiceImplPort() {
        return super.getPort(new QName("http://addressService.service.clinicawebservice.com/", "TaddressServiceImplPort"), TaddressService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaddressService
     */
    @WebEndpoint(name = "TaddressServiceImplPort")
    public TaddressService getTaddressServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://addressService.service.clinicawebservice.com/", "TaddressServiceImplPort"), TaddressService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TADDRESSSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw TADDRESSSERVICEIMPLSERVICE_EXCEPTION;
        }
        return TADDRESSSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
