package com.projectEmploye_jsf.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.projectEmploye_jsf.Entity.Employe;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	static {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Employe.class);
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable th) {
			System.err.println("Enitial SessionFactory creation failed" + th);
			throw new ExceptionInInitializerError(th);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}