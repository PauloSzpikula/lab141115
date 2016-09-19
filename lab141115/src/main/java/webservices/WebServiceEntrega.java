package webservices;

import java.util.Date;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import ejbs.ProcessEntrega;
import modelos.Entrega;

@WebService
public class WebServiceEntrega {

	@EJB
	ProcessEntrega ejb_process_entrega;

	@WebMethod(operationName="WebServiceEntrega")
	@WebResult(name="resultadoEntrega")
	public String doGet() {

    	//entrega
		Entrega entrega = new Entrega();
		entrega.setId(1);
		entrega.setData_inicio(new Date());
		entrega.setData_entrega(new Date());

//		ejb_process_entrega.processarEntrega(entrega);

		return "Retorno positivo";
    }
}
