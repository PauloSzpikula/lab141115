package mdbs;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import modelos.Venda;

@MessageDriven(name = "MdbAuditoria", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbAuditoria implements MessageListener {

	public void onMessage(Message mensagem) {

		ObjectMessage obj_msg = (ObjectMessage) mensagem;

		try {

			if (mensagem instanceof ObjectMessage) {

				Venda venda = (Venda) obj_msg.getObject();

				System.out.println("MdbAuditoria: nova venda realizada: Id: " + String.valueOf(venda.getId()));

			}

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}