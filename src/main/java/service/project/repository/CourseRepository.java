package service.project.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.domain.Course;
import com.project.util.HibernateUtil;

public class CourseRepository {
	
	
	public void createCourse(Course course) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(course);
		
		tx.commit();
		session.close();
		
	}

	
	public void removeCourse(Course course) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.remove(course);
		
		tx.commit();
		session.close();
		
	}

	
	public Course findByIdCourse(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Course course = session.get(Course.class, id); 
		
		tx.commit();
		session.close();
		return course;
	}

}
