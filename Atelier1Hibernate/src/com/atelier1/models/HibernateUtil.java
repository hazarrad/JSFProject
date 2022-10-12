package com.atelier1.models;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.atelier1.models.Client;



public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
		
		static {
		
			try {
			Configuration conf = new Configuration();
			conf.configure();
			conf.addAnnotatedClass(Client.class);
			
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			sessionFactory = conf.buildSessionFactory(serviceRegistry);
					
			}catch(Exception e) {		
			}
		}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
