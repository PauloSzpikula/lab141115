package testes;

import java.math.BigDecimal;

import webservices.WebServiceProduto.WebServiceProduto;
import webservices.WebServiceProduto.WebServiceProdutoService;

public class TestarProduto {

	public static void main(String[] args) {
		WebServiceProdutoService srv = new WebServiceProdutoService();
		WebServiceProduto port = srv.getWebServiceProdutoPort();

		String criar_retorno = port.produtoCriar(123, "Produto teste", new BigDecimal("1000"));
		System.out.println(criar_retorno);

		String atualiza_retorno = port.produtoAtualizar(1, 1234, "Produto teste 2", new BigDecimal("100"));
		System.out.println(atualiza_retorno);

		String ler_retorno = port.produtoLer(1);
		System.out.println(ler_retorno);

		String apagar_retorno = port.produtoExcluir(1);
		System.out.println(apagar_retorno);
	}
}