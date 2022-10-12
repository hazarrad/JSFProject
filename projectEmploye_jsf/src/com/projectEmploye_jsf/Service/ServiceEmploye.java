package com.projectEmploye_jsf.Service;

import java.util.List;


import com.projectEmploye_jsf.Entity.Employe;
import com.projectEmploye_jsf.IDao.DaoEmploye;

public class ServiceEmploye implements IService {

	DaoEmploye daoEmploye =new DaoEmploye();
	
	@Override
	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return daoEmploye.getAll();
	}

	@Override
	public boolean save(Employe o) {
		// TODO Auto-generated method stub
		return daoEmploye.save(o);
	}

	@Override
	public boolean update(Employe o) {
		// TODO Auto-generated method stub
		return daoEmploye.update(o);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return daoEmploye.delete(id);
	}

	@Override
	public Employe getById(int id) {
		// TODO Auto-generated method stub
		return daoEmploye.getById(id);
	}
 
}
