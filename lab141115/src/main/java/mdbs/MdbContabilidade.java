package mdbs;

import java.sql.Timestamp;
import java.util.Calendar;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import org.hibernate.Session;
import modelos.Log;
import modelos.Venda;
import persistencia.HibernateUtil;

@MessageDriven(name = "MdbContabilidade", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
@TransactionManagement(TransactionManagementType.BEAN)
public class MdbContabilidade implements MessageListener {

	public void onMessage(Message mensagem) {
		ObjectMessage obj_msg = (ObjectMessage) mensagem;
		try {
			if (mensagem instanceof ObjectMessage) {

				System.out.println("MdbContabilidade: iniciando a venda...");

				Venda venda;
				venda = (Venda) obj_msg.getObject();

				System.out.println("MdbContabilidade: nova venda realizada: Id: " + String.valueOf(venda.getId()));
				String inf = "MdbContabilidade: nova venda realizada: Id: " + String.valueOf(venda.getId());

				System.out.println("MdbContabilidade: Montando Log...");
				Log log = new Log();
				log.setNomeMDB(MdbAuditoria.class.toString());
				log.setDataHora(new Timestamp(Calendar.getInstance().getTimeInMillis()));
				log.setInformacao(inf);

				System.out.println("MdbContabilidade: Salvando Log...");
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.persist(log);
				session.getTransaction().commit();
				session.close();

				System.out.println("MdbContabilidade: Processo finalizado!");
			}

		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}