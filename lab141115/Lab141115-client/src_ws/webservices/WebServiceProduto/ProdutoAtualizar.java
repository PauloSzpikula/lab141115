
package webservices.WebServiceProduto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoAtualizar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtoAtualizar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_produto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoAtualizar", propOrder = {
    "idProduto",
    "codigoBarra",
    "descricao",
    "preco"
})
public class ProdutoAtualizar {

    @XmlElement(name = "id_produto")
    protected int idProduto;
    protected int codigoBarra;
    protected String descricao;
    protected BigDecimal preco;

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

    /**
     * Obtém o valor da propriedade codigoBarra.
     * 
     */
    public int getCodigoBarra() {
        return codigoBarra;
    }

    /**
     * Define o valor da propriedade codigoBarra.
     * 
     */
    public void setCodigoBarra(int value) {
        this.codigoBarra = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreco(BigDecimal value) {
        this.preco = value;
    }

}
