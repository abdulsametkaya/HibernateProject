package com.project.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory factory = createSessionFactory();

	private static SessionFactory createSessionFactory() {
		
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
			return factory;
		} catch (Exception ex) {
			System.err.println("Session Factory could not be created:"+ex);	
			throw new ExceptionInInitializerError(ex.getMessage());
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	

}
