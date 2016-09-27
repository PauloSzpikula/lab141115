
package webservices.WebServiceProduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoCriarResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoCriarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoProdutoCriar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoCriarResponse", propOrder = {
    "resultadoProdutoCriar"
})
public class ProdutoCriarResponse {

    protected String resultadoProdutoCriar;

    /**
     * Obtém o valor da propriedade resultadoProdutoCriar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoProdutoCriar() {
        return resultadoProdutoCriar;
    }

    /**
     * Define o valor da propriedade resultadoProdutoCriar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoProdutoCriar(String value) {
        this.resultadoProdutoCriar = value;
    }

}
