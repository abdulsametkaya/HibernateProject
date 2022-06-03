package service.project.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.domain.Student;
import com.project.util.HibernateUtil;

public class StudentRepository {
	

	public void createStudent(Student student) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(student);

		tx.commit();
		session.close();
		
	}

	
	public void removeStudent(Student student) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.remove(student);

		tx.commit();
		session.close();
	}

	
	public Student findByIdStudent(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class,id);

		tx.commit();
		session.close();
		
		
			return student;
		
	}

}
