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

import modelos.Log;
import modelos.Venda;
import persistencia.HibernateUtil;

@MessageDriven(name = "MdbFinanceiro", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbFinanceiro implements MessageListener {

	public void onMessage(Message mensagem) {

		ObjectMessage obj_msg = (ObjectMessage) mensagem;

		try {

			if (mensagem instanceof ObjectMessage) {

				Venda venda = (Venda) obj_msg.getObject();
				//System.out.println("MdbFinanceiro: nova venda realizada: Id: " + String.valueOf(venda.getId()));
				String inf = "MdbFinanceiro: nova venda realizada: Id: " + String.valueOf(venda.getId());

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