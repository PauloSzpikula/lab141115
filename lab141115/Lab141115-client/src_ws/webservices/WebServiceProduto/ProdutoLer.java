
package webservices.WebServiceProduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoLer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoLer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_produto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoLer", propOrder = {
    "idProduto"
})
public class ProdutoLer {

    @XmlElement(name = "id_produto")
    protected int idProduto;

    /**
     * Obtém o valor da propriedade idProduto.
     * 
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o valor da propriedade idProduto.
     * 
     */
    public void setIdProduto(int value) {
        this.idProduto = value;
    }

}
