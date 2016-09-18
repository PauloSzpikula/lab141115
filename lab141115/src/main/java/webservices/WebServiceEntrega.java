package webservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.ProcessEntrega;
import modelos.Entrega;

@WebService
public class WebServiceEntrega {

	@EJB
	ProcessEntrega ejb_process_entrega;

	@WebMethod(operationName="operacaoDoGetEntrega")
	@WebResult(name="resultadoEntrega")
    protected void doGet(@WebParam(name="parReq")HttpServletRequest req, @WebParam(name="parResp") HttpServletResponse resp) throws IOException {

    	System.out.println("ServletEntrega: Chamada do navegador");

    	//entrega
		Entrega entrega = new Entrega();
		entrega.setId(1);
		entrega.setData_inicio(new Date());
		entrega.setData_entrega(new Date());

	    System.out.println("ServletEntrega: criando entrega");

		System.out.println("ServletEntrega: enviando venda para o EJB ProcessEntrega");
		ejb_process_entrega.processarEntrega(entrega);

		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.write("<p>Operação entrega concluída!</p>");
    }
}
