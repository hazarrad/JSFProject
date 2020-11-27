package com.jEFM2.Dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;

import org.hibernate.Transaction;

import com.EFM2.Entity.Etudiant;
import com.EFM2.Entity.Filiere;
import com.EFM2.Hbr.HibernateUtil;

public class DaoEtudiant {

	Session session = HibernateUtil.getSessionFactory().openSession();

	public static List<Etudiant> getAlletudiant() {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Etudiant> cls2 = new ArrayList<Etudiant>();
		Transaction tr = s.beginTransaction();

		try {
			cls2 = s.createQuery("from Etudiant").list();

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
		return cls2;
	}
	
	public static List<Filiere> getAllfil() {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Filiere> cls2 = new ArrayList<Filiere>();
		Transaction tr = s.beginTransaction();

		try {
			cls2 = s.createQuery("from Filiere").list();

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
		return cls2;
	}

	public void save(Etudiant et){
		session.beginTransaction();
		session.save(et);
		session.getTransaction().commit();
		session.close();
	}

	public static void delete(int id) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		try {
			
			
			Etudiant et = new Etudiant();
			et.setId(id);
			s.delete(et);
			System.out.println("User successfully removed.");

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}

	}
	
	public static void update(Etudiant et) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		try {
			
			
			Etudiant ete = new Etudiant();
			s.update(et);
			System.out.println("User successfully update.");

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}

	}
	  
    public void updateStudent(Etudiant student)
    {
        Transaction trans=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(student);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        
    }
	


}
