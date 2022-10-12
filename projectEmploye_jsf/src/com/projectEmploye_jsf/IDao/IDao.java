package com.projectEmploye_jsf.IDao;

import java.util.List;
import com.projectEmploye_jsf.Entity.Employe;

public interface IDao {

	List<Employe> getAll();
	boolean save(Employe o);
	boolean update(Employe o);
	boolean delete(int id);
	Employe getById (int id);


}
