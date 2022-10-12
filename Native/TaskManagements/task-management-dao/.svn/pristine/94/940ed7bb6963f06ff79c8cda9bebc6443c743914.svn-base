package com.everis.taskmanagement.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.everis.taskmanagement.dao.GenericDAO;
import com.everis.taskmanagement.model.Client;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K>{
	
    private SessionFactory sessionFactory;
	
	private Session session;
	
	private Class<T> type;
	
	public Class<T> getType() {
		return type;
	}
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		  this.sessionFactory = getSessionFactory();
		  Type t = getClass().getGenericSuperclass(); 
		  ParameterizedType pt =(ParameterizedType) t; 
		  type = (Class<T>) pt.getActualTypeArguments()[0];
		 
	}
	
	private SessionFactory getSessionFactory() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from
				.build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		return sessionFactory;
	}

	@Override
	public T create(T t) throws Exception {
		//open session
		session = sessionFactory.openSession();
		//begin transaction
		session.beginTransaction();
		//save object
		session.save(t);
		//end of transaction
		session.getTransaction().commit();
		//close session
		session.close();
		return t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		List<T> result = null;
		//open session
		session = sessionFactory.openSession();
		//begin transaction
        session.beginTransaction();
        result = session.createQuery("from " + type.getSimpleName()).list();
        
        //end of transaction
		session.getTransaction().commit();
		//close session
		session.close();
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T udpate(K k, T t) {
		//open session
		session = sessionFactory.openSession();
		//begin transaction
		session.beginTransaction();
		//T result = (T) session.update((T) session.get(type, (Long)k));
		//T result = (T) session.get(t.getClass(),(Long)k);
		session.update(t);
		//end of transaction
		session.getTransaction().commit();
		//close session
		session.close();
		return t;
	}

	@Override
	public void delete(K k) throws Exception{
		/*
		 * //open session session = sessionFactory.openSession(); //begin transaction
		 * session.beginTransaction(); session.remove(k); //end of transaction
		 * session.getTransaction().commit(); //close session session.close();
		 */
		//open session
		session = sessionFactory.openSession();
		//begin transaction
		session.beginTransaction();
		session.delete((T) session.get(type, (Long)k));
		//end of transaction
		session.getTransaction().commit();
		//close session
		session.close();
				
		
	}
	@Override
	public T getById(K k) throws Exception{
		//open session
		session = sessionFactory.openSession();
		//begin transaction
		session.beginTransaction();
		T result = session.find(type, k);
		//end of transaction
		session.getTransaction().commit();
		//close session
		session.close();
		return result;
	}
	


}
