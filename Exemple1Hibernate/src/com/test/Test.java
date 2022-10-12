package com.test;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateUtil;
import com.model.Employe;

public class Test {

	public static void main(String[] args) {
		
		Employe e = new Employe();
		e.setId(1);
		e.setNom("new HHH");
		e.setSalaire(66633);
		
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Transaction tr = s.beginTransaction();
		
		s.save(e);
		
		tr.commit();
		
		
		
		
		s.close();
	}
}
