package com.everis.taskmanagement.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.everis.taskmanagement.dao.ProjectDAO;
import com.everis.taskmanagement.model.Project;

public class ProjectDAOImpl extends GenericDAOImpl<Project,Long> implements ProjectDAO{


	private SessionFactory sessionFactory;

	private Session session;
//	private Products product;
	
	@SuppressWarnings("unchecked")
	public ProjectDAOImpl() {
		this.sessionFactory = getsessionFactory();
		 
	}
	
	private SessionFactory getsessionFactory() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		return sessionFactory;
	}

	
	@Override
	public Project getByPK(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getvalueById(Long id) throws Exception {
		session = sessionFactory.openSession();

		// begin transaction
		session.beginTransaction();
		
		Project tFromDB = (Project) session.get(Project.class, (Long) id);
		
		// end transaction
		session.getTransaction().commit();

		// close session
		session.close();
		return tFromDB;
	}

}
