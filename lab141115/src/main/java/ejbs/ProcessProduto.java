package ejbs;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import modelos.Produto;
import persistencia.HibernateUtil;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProcessProduto {

	public String criar(Produto produto){

		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(produto);
        session.getTransaction().commit();
        session.close();

        return "Id: " + produto.getId() + " Produto: " + produto.getDescricao() + ", cadastrado!";
	}

	public String ler(int id){

		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Produto.class);
        criteria.add(Restrictions.idEq(id));
        java.util.List result = criteria.list();
        session.close();

        if(result.size() > 0){
        	Produto produto = (Produto) result.get(0);
        	return "Id: " + produto.getId() + " Código de barras: " + produto.getCodigoBarra() + " Produto: " + produto.getDescricao() + " Valor:  " + produto.getPreco();
        }else{
        	return "Erro!";
        }
	}

	public String atualizar(Produto produto){

		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(produto);
        session.getTransaction().commit();
        session.close();

        return "Id: " + produto.getId() + " Produto: " + produto.getDescricao() + ", atualizado!";
	}

	public String deletar(int id){

		Produto produto = new Produto();
		produto.setId(id);
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        try{
        	session.delete(produto);
            session.getTransaction().commit();
            session.close();

            return "Id: " + produto.getId() + ", excluído!";
        }catch (Exception e) {
        	session.close();
        	return "Erro!";
        }
	}
}