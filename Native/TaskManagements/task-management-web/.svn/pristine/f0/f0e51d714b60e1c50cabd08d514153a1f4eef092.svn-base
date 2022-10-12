package com.everis.taskmanagement.servlet;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.everis.taskmanagement.model.Client;
/*import com.everis.taskmanagement.model.Employee;*/

public class Main {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory  = config.buildSessionFactory();
		
		Session session  = sessionFactory.openSession();
		
		Client client = new Client();
		Transaction transaction = null;
		transaction = session.beginTransaction();
		client.setEmail("nouhaila@gmail.com");
		session.delete(client);
		transaction.commit();
		session.close();
		
		

	}

}
