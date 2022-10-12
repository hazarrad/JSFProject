package com.everis.taskmanagement.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.everis.taskmanagement.dao.ClientDAO;
import com.everis.taskmanagement.model.Client;

public class ClientDAOImpl extends GenericDAOImpl<Client,Long> implements ClientDAO{

	 private SessionFactory sessionFactory;
		
		private Session session;

		public Client getByPK(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	/*
	 * private SessionFactory sessionFactory;
	 * 
	 * private Session session;
	 * 
	 * public ClientDAOImpl() { this.sessionFactory = getSessionFactory(); }
	 * 
	 * private SessionFactory getSessionFactory() { StandardServiceRegistry registry
	 * = new StandardServiceRegistryBuilder().configure() // configures settings
	 * from .build(); sessionFactory = new
	 * MetadataSources(registry).buildMetadata().buildSessionFactory(); return
	 * sessionFactory; }
	 * 
	 * @Override public Client getByPK(Long id) { //open session session =
	 * sessionFactory.openSession(); //begin transaction session.beginTransaction();
	 * Client result = session.find(Client.class, id); //end of transaction
	 * session.getTransaction().commit(); //close session session.close(); return
	 * result;
	 * 
	 * }
	 */
}
