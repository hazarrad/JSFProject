package com.rv.ImpDao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.rv.entities.Medecin;
import com.rv.idao.IDAOMedecin;

@Repository("daoMedecin")
@Transactional
@EnableTransactionManagement
public class DaoMedecin implements IDAOMedecin {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Medecin> getAllMedecins() {
		
		return sessionFactory.getCurrentSession().createQuery("from Medecin").list();
	}

	@Override
	public Medecin findByCode(int code) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Medecin.class, code);
	}

	@Override
	public boolean add(Medecin m) {
		try {
			sessionFactory.getCurrentSession().save(m);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Medecin m) {
		try {
			sessionFactory.getCurrentSession().update(m);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Medecin m) {
		try {
			sessionFactory.getCurrentSession().delete(m);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
