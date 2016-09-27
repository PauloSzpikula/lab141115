
package webservices.WebServiceProduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoExcluirResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoExcluirResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoProdutoDeletar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoExcluirResponse", propOrder = {
    "resultadoProdutoDeletar"
})
public class ProdutoExcluirResponse {

    protected String resultadoProdutoDeletar;

    /**
     * Obtém o valor da propriedade resultadoProdutoDeletar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoProdutoDeletar() {
        return resultadoProdutoDeletar;
    }

    /**
     * Define o valor da propriedade resultadoProdutoDeletar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoProdutoDeletar(String value) {
        this.resultadoProdutoDeletar = value;
    }

}
