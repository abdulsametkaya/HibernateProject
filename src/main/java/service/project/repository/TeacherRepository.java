package service.project.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.domain.Teacher;
import com.project.util.HibernateUtil;

public class TeacherRepository {

	
	public void createTeacher(Teacher teacher) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(teacher);

		tx.commit();
		session.close();
		
	}

	
	public void removeTeacher(Teacher teacher) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.remove(teacher);

		tx.commit();
		session.close();
		
	}

	
	public Teacher findByIdTeacher(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Teacher teacher = session.get(Teacher.class,id);

		tx.commit();
		session.close();
		
		
			return teacher;
	}
	

	public Teacher UpdateTeacher(int id, String name ) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Teacher teacher = session.get(Teacher.class,id);

		teacher.setName(name);
		
		tx.commit();
		session.close();
		
		
		return teacher;
	}
}
