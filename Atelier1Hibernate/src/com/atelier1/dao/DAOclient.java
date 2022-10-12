package com.atelier1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atelier1.models.Client;
import com.atelier1.models.HibernateUtil;

public class DAOclient {

	public static List<Client> getAll(){
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession(); 
		List<Client> cls=null;
		Transaction tr = s.beginTransaction(); 
		
		try {
			cls = s.createQuery("from Client").list();
			
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
		}
		return cls;
		
	}
	
	public static void AddClient(Client c){
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession(); 
		Transaction tr = s.beginTransaction(); 
		
		try {
			s.save(c);
			
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
		}
		
	}
	
	public static void RemoveClient(Client c){
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession(); 
		Transaction tr = s.beginTransaction(); 
		
		try {
			s.delete(c);
			
			tr.commit();
		}catch (Exception e) {
			tr.rollback();
		}
		
	}
}
