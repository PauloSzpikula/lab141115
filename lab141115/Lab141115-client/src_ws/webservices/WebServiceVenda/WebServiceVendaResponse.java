
package webservices.WebServiceVenda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WebServiceVendaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WebServiceVendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceVendaResponse", propOrder = {
    "resultadoVenda"
})
public class WebServiceVendaResponse {

    protected String resultadoVenda;

    /**
     * Obtém o valor da propriedade resultadoVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoVenda() {
        return resultadoVenda;
    }

    /**
     * Define o valor da propriedade resultadoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoVenda(String value) {
        this.resultadoVenda = value;
    }

}
