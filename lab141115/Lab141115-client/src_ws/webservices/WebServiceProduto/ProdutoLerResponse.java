
package webservices.WebServiceProduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoLerResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoLerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoProdutoLer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoLerResponse", propOrder = {
    "resultadoProdutoLer"
})
public class ProdutoLerResponse {

    protected String resultadoProdutoLer;

    /**
     * Obtém o valor da propriedade resultadoProdutoLer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoProdutoLer() {
        return resultadoProdutoLer;
    }

    /**
     * Define o valor da propriedade resultadoProdutoLer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoProdutoLer(String value) {
        this.resultadoProdutoLer = value;
    }

}
