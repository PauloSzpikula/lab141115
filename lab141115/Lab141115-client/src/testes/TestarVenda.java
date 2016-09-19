package testes;

import webservices.WebServiceVenda.WebServiceVenda;
import webservices.WebServiceVenda.WebServiceVendaService;

public class TestarVenda {

	public static void main(String[] args) {
		WebServiceVendaService service = new WebServiceVendaService();
		WebServiceVenda port = service.getWebServiceVendaPort();
		String resultado = port.webServiceVenda();
		System.out.println(resultado);
	}

}
