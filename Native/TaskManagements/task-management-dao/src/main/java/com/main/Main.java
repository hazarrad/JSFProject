package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.everis.taskmanagement.model.Client;

public class Main {

	public static void main(String[] args) {

		
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		
		Client c=new Client();
		c.setName("hassan");
		c.setEmail("hassan@evris.com");
		c.setPhone(0655);
				
		session.save(c);

		session.getTransaction().commit();
		
		session.close();
	}
}
