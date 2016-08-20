package ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import modelos.Entrega;

@Stateless
public class ProcessEntrega {

    @Inject
    private JMSContext context;

    @Resource(lookup = "java:/queue/pedido")
  	private Queue queue;


	public void processarEntrega (Entrega entrega) {
		System.out.println("EJB ProcessEntrega: entrega recebida");

		final Destination destination = queue;

	    try{

	    	System.out.println("EJB ProcessEntrega: processando entrega");

	    	ObjectMessage obj_msg = context.createObjectMessage();

	    	obj_msg.setObject(entrega);

			System.out.println("EJB ProcessEntrega: enviando mensagem para o(s) MDB(s)");

			context.createProducer().send(destination, obj_msg);

	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
    }
}
