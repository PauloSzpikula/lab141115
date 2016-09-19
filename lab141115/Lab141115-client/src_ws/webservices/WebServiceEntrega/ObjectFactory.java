
package webservices.WebServiceEntrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.WebServiceEntrega package. 
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

    private final static QName _WebServiceEntregaResponse_QNAME = new QName("http://webservices/", "WebServiceEntregaResponse");
    private final static QName _WebServiceEntrega_QNAME = new QName("http://webservices/", "WebServiceEntrega");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.WebServiceEntrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceEntrega_Type }
     * 
     */
    public WebServiceEntrega_Type createWebServiceEntrega_Type() {
        return new WebServiceEntrega_Type();
    }

    /**
     * Create an instance of {@link WebServiceEntregaResponse }
     * 
     */
    public WebServiceEntregaResponse createWebServiceEntregaResponse() {
        return new WebServiceEntregaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "WebServiceEntregaResponse")
    public JAXBElement<WebServiceEntregaResponse> createWebServiceEntregaResponse(WebServiceEntregaResponse value) {
        return new JAXBElement<WebServiceEntregaResponse>(_WebServiceEntregaResponse_QNAME, WebServiceEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceEntrega_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "WebServiceEntrega")
    public JAXBElement<WebServiceEntrega_Type> createWebServiceEntrega(WebServiceEntrega_Type value) {
        return new JAXBElement<WebServiceEntrega_Type>(_WebServiceEntrega_QNAME, WebServiceEntrega_Type.class, null, value);
    }

}
