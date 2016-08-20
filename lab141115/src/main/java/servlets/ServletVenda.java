package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.ProcessVenda;
import modelos.Venda;


@WebServlet("/venda")
public class ServletVenda extends HttpServlet {

	@EJB
	ProcessVenda ejb_process_venda;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    	System.out.println("ServletVenda: Chamada do navegador");

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

	    System.out.println("ServletVenda: criando venda");

	    System.out.println("ServletVenda: enviando venda para o EJB ProcessVenda");

	    ejb_process_venda.processarVenda(venda);

		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.write("<p>Operação venda concluída!</p>");

    }
}
