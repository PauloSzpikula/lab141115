package ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Topic;
import modelos.Venda;

@Stateless
public class ProcessVenda {

    @Inject
    private JMSContext context;

    @Resource(lookup = "java:/topic/venda")
    private Topic topic;

	public void processarVenda (Venda venda){

		System.out.println("EJB ProcessVenda: venda recebida");

		final Destination destination = topic;

	    try{

	    	System.out.println("EJB ProcessVenda: processando venda");

	    	ObjectMessage obj_msg = context.createObjectMessage();

	    	obj_msg.setObject(venda);

			System.out.println("EJB ProcessVenda: enviando mensagem para o(s) MDB(s)");

			context.createProducer().send(destination, obj_msg);

	    } catch(Exception e) {
	    	e.printStackTrace();
	    }

	}

}
