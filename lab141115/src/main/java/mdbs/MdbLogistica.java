package mdbs;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import modelos.Entrega;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/pedido"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
	    @ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1")
})
public class MdbLogistica implements MessageListener {

	public void onMessage(Message mensagem) {

		ObjectMessage obj_msg = (ObjectMessage) mensagem;

		try {

			if (mensagem instanceof ObjectMessage) {
				System.out.println("MdbLogistica: iniciando a entrega ...");
				Entrega entrega = (Entrega) obj_msg.getObject();
            	try {
					Thread.sleep(30000);
					System.out.println("MdbLogistica: nova entrega realizada: Id: " + String.valueOf(entrega.getId()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}