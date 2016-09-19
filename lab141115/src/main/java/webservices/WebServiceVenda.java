package webservices;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import ejbs.ProcessVenda;
import modelos.Venda;

@WebService
public class WebServiceVenda {

	@EJB
	ProcessVenda ejb_process_venda;

	@WebMethod(operationName="WebServiceVenda")
	@WebResult(name="resultadoVenda")
    public String doGet() {

	    // itens
	    List<String> itens = Arrays.asList("item 1", "item 2");

	    //venda
	    Venda venda = new Venda();
	    venda.setId(1);
	    venda.setData(new Date());
	    venda.setLista_de_itens(itens);
	    venda.setDescricao("Vendona");
	    venda.setValor(200.00);
	    venda.setItens(itens.size());

//	    ejb_process_venda.processarVenda(venda);

	    return "Retorno positivo";
	}
}
