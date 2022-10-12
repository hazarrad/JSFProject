package com.jEFM2.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;

import com.EFM2.Entity.Etudiant;
import com.EFM2.Entity.Filiere;
import com.EFM2.Hbr.HibernateUtil;

public class DaoEtudiant {

	public static List<Etudiant> getAllEtudiant() {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Etudiant> cls = new ArrayList<Etudiant>();
		Transaction tr = s.beginTransaction();

		try {
			cls = s.createQuery("from Etudiant").list();

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
		return cls;
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

	public static void AddEtudiant(Etudiant et) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		try {
			et.getId();
			et.getNom();
			et.getPrenom();
			et.getFiliere();
			s.save(et);

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
	}

	public static void DeleteEtudiant(Etudiant et) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		try {
			s.delete(et);

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
	}

	public static void UpdateEtudiant(Etudiant et) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		try {
			s.update(et);

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
	}

}
