
package webservices.WebServiceVenda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.WebServiceVenda package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebServiceVenda_QNAME = new QName("http://webservices/", "WebServiceVenda");
    private final static QName _WebServiceVendaResponse_QNAME = new QName("http://webservices/", "WebServiceVendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.WebServiceVenda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceVendaResponse }
     * 
     */
    public WebServiceVendaResponse createWebServiceVendaResponse() {
        return new WebServiceVendaResponse();
    }

    /**
     * Create an instance of {@link WebServiceVenda_Type }
     * 
     */
    public WebServiceVenda_Type createWebServiceVenda_Type() {
        return new WebServiceVenda_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceVenda_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "WebServiceVenda")
    public JAXBElement<WebServiceVenda_Type> createWebServiceVenda(WebServiceVenda_Type value) {
        return new JAXBElement<WebServiceVenda_Type>(_WebServiceVenda_QNAME, WebServiceVenda_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceVendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "WebServiceVendaResponse")
    public JAXBElement<WebServiceVendaResponse> createWebServiceVendaResponse(WebServiceVendaResponse value) {
        return new JAXBElement<WebServiceVendaResponse>(_WebServiceVendaResponse_QNAME, WebServiceVendaResponse.class, null, value);
    }

}
