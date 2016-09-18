package mdbs;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.hibernate.Session;

import modelos.Entrega;
import modelos.Log;
import persistencia.HibernateUtil;

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
					//System.out.println("MdbLogistica: nova entrega realizada: Id: " + String.valueOf(entrega.getId()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

            	String inf = "MdbLogistica: nova entrega realizada: Id: " + String.valueOf(entrega.getId());

				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();

				Log log = new Log();
				log.setNomeMDB(MdbAuditoria.class.toString());
				log.setDataHora(new Timestamp(Calendar.getInstance().getTimeInMillis()));
				log.setInformacao(inf);

				session.persist(log);

				session.getTransaction().commit();
				session.close();
				HibernateUtil.finalizar();

			}

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}