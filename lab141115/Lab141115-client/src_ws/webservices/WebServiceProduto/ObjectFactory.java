
package webservices.WebServiceProduto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.WebServiceProduto package. 
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

    private final static QName _ProdutoCriarResponse_QNAME = new QName("http://webservices/", "produtoCriarResponse");
    private final static QName _ProdutoExcluirResponse_QNAME = new QName("http://webservices/", "produtoExcluirResponse");
    private final static QName _ProdutoCriar_QNAME = new QName("http://webservices/", "produtoCriar");
    private final static QName _ProdutoLer_QNAME = new QName("http://webservices/", "produtoLer");
    private final static QName _ProdutoLerResponse_QNAME = new QName("http://webservices/", "produtoLerResponse");
    private final static QName _ProdutoExcluir_QNAME = new QName("http://webservices/", "produtoExcluir");
    private final static QName _ProdutoAtualizar_QNAME = new QName("http://webservices/", "produtoAtualizar");
    private final static QName _ProdutoAtualizarResponse_QNAME = new QName("http://webservices/", "produtoAtualizarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.WebServiceProduto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProdutoAtualizarResponse }
     * 
     */
    public ProdutoAtualizarResponse createProdutoAtualizarResponse() {
        return new ProdutoAtualizarResponse();
    }

    /**
     * Create an instance of {@link ProdutoAtualizar }
     * 
     */
    public ProdutoAtualizar createProdutoAtualizar() {
        return new ProdutoAtualizar();
    }

    /**
     * Create an instance of {@link ProdutoExcluir }
     * 
     */
    public ProdutoExcluir createProdutoExcluir() {
        return new ProdutoExcluir();
    }

    /**
     * Create an instance of {@link ProdutoLer }
     * 
     */
    public ProdutoLer createProdutoLer() {
        return new ProdutoLer();
    }

    /**
     * Create an instance of {@link ProdutoLerResponse }
     * 
     */
    public ProdutoLerResponse createProdutoLerResponse() {
        return new ProdutoLerResponse();
    }

    /**
     * Create an instance of {@link ProdutoCriar }
     * 
     */
    public ProdutoCriar createProdutoCriar() {
        return new ProdutoCriar();
    }

    /**
     * Create an instance of {@link ProdutoExcluirResponse }
     * 
     */
    public ProdutoExcluirResponse createProdutoExcluirResponse() {
        return new ProdutoExcluirResponse();
    }

    /**
     * Create an instance of {@link ProdutoCriarResponse }
     * 
     */
    public ProdutoCriarResponse createProdutoCriarResponse() {
        return new ProdutoCriarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoCriarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoCriarResponse")
    public JAXBElement<ProdutoCriarResponse> createProdutoCriarResponse(ProdutoCriarResponse value) {
        return new JAXBElement<ProdutoCriarResponse>(_ProdutoCriarResponse_QNAME, ProdutoCriarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoExcluirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoExcluirResponse")
    public JAXBElement<ProdutoExcluirResponse> createProdutoExcluirResponse(ProdutoExcluirResponse value) {
        return new JAXBElement<ProdutoExcluirResponse>(_ProdutoExcluirResponse_QNAME, ProdutoExcluirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoCriar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoCriar")
    public JAXBElement<ProdutoCriar> createProdutoCriar(ProdutoCriar value) {
        return new JAXBElement<ProdutoCriar>(_ProdutoCriar_QNAME, ProdutoCriar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoLer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoLer")
    public JAXBElement<ProdutoLer> createProdutoLer(ProdutoLer value) {
        return new JAXBElement<ProdutoLer>(_ProdutoLer_QNAME, ProdutoLer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoLerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoLerResponse")
    public JAXBElement<ProdutoLerResponse> createProdutoLerResponse(ProdutoLerResponse value) {
        return new JAXBElement<ProdutoLerResponse>(_ProdutoLerResponse_QNAME, ProdutoLerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoExcluir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoExcluir")
    public JAXBElement<ProdutoExcluir> createProdutoExcluir(ProdutoExcluir value) {
        return new JAXBElement<ProdutoExcluir>(_ProdutoExcluir_QNAME, ProdutoExcluir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoAtualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoAtualizar")
    public JAXBElement<ProdutoAtualizar> createProdutoAtualizar(ProdutoAtualizar value) {
        return new JAXBElement<ProdutoAtualizar>(_ProdutoAtualizar_QNAME, ProdutoAtualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoAtualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "produtoAtualizarResponse")
    public JAXBElement<ProdutoAtualizarResponse> createProdutoAtualizarResponse(ProdutoAtualizarResponse value) {
        return new JAXBElement<ProdutoAtualizarResponse>(_ProdutoAtualizarResponse_QNAME, ProdutoAtualizarResponse.class, null, value);
    }

}
