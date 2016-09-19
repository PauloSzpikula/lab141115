
package webservices.WebServiceEntrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WebServiceEntregaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WebServiceEntregaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebServiceEntregaResponse", propOrder = {
    "resultadoEntrega"
})
public class WebServiceEntregaResponse {

    protected String resultadoEntrega;

    /**
     * Obt�m o valor da propriedade resultadoEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoEntrega() {
        return resultadoEntrega;
    }

    /**
     * Define o valor da propriedade resultadoEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoEntrega(String value) {
        this.resultadoEntrega = value;
    }

}
