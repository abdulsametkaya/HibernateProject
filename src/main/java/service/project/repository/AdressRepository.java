package service.project.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.domain.Adress;
import com.project.util.HibernateUtil;

public class AdressRepository {

	public void createAdress(Adress adress) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(adress);

		tx.commit();
		session.close();

	}

	public void removeAdress(Adress adress) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.remove(adress);
		;

		tx.commit();
		session.close();

	}

	public Adress findByIdAdress(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Adress adress = session.get(Adress.class, id);

		tx.commit();
		session.close();

		return adress;

	}

}
