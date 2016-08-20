package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.ProcessEntrega;
import modelos.Entrega;

@WebServlet("/entrega")
public class ServletEntrega extends HttpServlet {

	@EJB
	ProcessEntrega ejb_process_entrega;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

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
