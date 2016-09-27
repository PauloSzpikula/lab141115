
package webservices.WebServiceProduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoAtualizarResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoAtualizarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoProdutoAtualizar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoAtualizarResponse", propOrder = {
    "resultadoProdutoAtualizar"
})
public class ProdutoAtualizarResponse {

    protected String resultadoProdutoAtualizar;

    /**
     * Obtém o valor da propriedade resultadoProdutoAtualizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoProdutoAtualizar() {
        return resultadoProdutoAtualizar;
    }

    /**
     * Define o valor da propriedade resultadoProdutoAtualizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoProdutoAtualizar(String value) {
        this.resultadoProdutoAtualizar = value;
    }

}
