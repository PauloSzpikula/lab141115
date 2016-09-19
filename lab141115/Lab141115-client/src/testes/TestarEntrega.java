package testes;

import webservices.WebServiceEntrega.WebServiceEntrega;
import webservices.WebServiceEntrega.WebServiceEntregaService;

public class TestarEntrega {

	public static void main(String[] args) {
		WebServiceEntregaService service = new WebServiceEntregaService();
		WebServiceEntrega port = service.getWebServiceEntregaPort();
		String resultado = port.webServiceEntrega();
		System.out.println(resultado);
	}
}
