package com.projectEmploye_jsf.IDao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.projectEmploye_jsf.Entity.Employe;
import com.projectEmploye_jsf.Hibernate.HibernateUtil;


public class DaoEmploye implements IDao {
	
	

	
	@Override
	public boolean update(Employe o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employe getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getAll() {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Employe> cls = new ArrayList<Employe>();
		Transaction tr = s.beginTransaction();

		try {
			cls = s.createQuery("from Employe").list();

			tr.commit();
		} catch (Exception e) {
			tr.rollback();
		}
		return cls;
	}

	@Override
	public boolean save(Employe o) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();

		s.beginTransaction();
		s.save(o);
		s.getTransaction().commit();
		s.close();
		
		return true;
	}

	@Override
	public boolean delete(int id) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tr = s.beginTransaction();

		Employe et = new Employe();
		et.setId(id);
		s.delete(et);
		tr.commit();

		return true;
	}
}
