package com.ManagerCar.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.MangerCar.Beans.BeanMarque;
import com.MangerCar.Dao.DaoMaruqe;
import com.MangerCar.Entity.Marque;

public class HibernateUtile {

	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	static {

		try {
			Configuration configuration = new Configuration();
			configuration.configure();

			//configuration.addAnnotatedClass(Marque.class);

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
