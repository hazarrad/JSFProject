package com.exemple.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ecole.beans.Etudiant;
import com.ecole.beans.Filiere;

public class HibernateUtile {

	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static {

		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			
			configuration.addAnnotatedClass(Etudiant.class);
			configuration.addAnnotatedClass(Filiere.class);
			
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
