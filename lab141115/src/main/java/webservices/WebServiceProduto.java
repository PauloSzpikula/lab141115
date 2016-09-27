package webservices;

import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import ejbs.ProcessProduto;
import modelos.Produto;

@WebService
public class WebServiceProduto {

	@EJB
	ProcessProduto processProduto;

	@WebMethod(operationName = "produtoCriar")
	@WebResult(name = "resultadoProdutoCriar")
	public String criar(@WebParam(name="codigoBarra") int codigoBarra, @WebParam(name="descricao") String descricao, @WebParam(name="preco")BigDecimal preco){

		Produto produto = new Produto();
		produto.setCodigoBarra(codigoBarra);
		produto.setDescricao(descricao);
		produto.setPreco(preco);

		return processProduto.criar(produto);
	}

	@WebMethod(operationName = "produtoLer")
	@WebResult(name = "resultadoProdutoLer")
	public String ler(@WebParam(name = "id_produto") int id){
		return processProduto.ler(id);
	}

	@WebMethod(operationName = "produtoAtualizar")
	@WebResult(name = "resultadoProdutoAtualizar")
	public String atualizar(@WebParam(name = "id_produto") int id, @WebParam(name="codigoBarra") int codigoBarra, @WebParam(name="descricao") String descricao, @WebParam(name="preco")BigDecimal preco){

		Produto produto = new Produto();
		produto.setId(id);
		produto.setCodigoBarra(codigoBarra);
		produto.setDescricao(descricao);
		produto.setPreco(preco);

		return processProduto.atualizar(produto);
	}

	@WebMethod(operationName = "produtoExcluir")
	@WebResult(name = "resultadoProdutoDeletar")
	public String delete(@WebParam(name = "id_produto") int id){
		return processProduto.deletar(id);
	}
}
