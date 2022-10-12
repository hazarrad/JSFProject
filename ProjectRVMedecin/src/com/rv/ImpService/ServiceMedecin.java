package com.rv.ImpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rv.entities.Medecin;
import com.rv.idao.IDAOMedecin;
import com.rv.iservice.IServiceMedecin;

@Service("serviceMedecin")
public class ServiceMedecin implements IServiceMedecin {

	@Autowired
	IDAOMedecin daoMedecin;
	
	@Override
	public List<Medecin> getAllMedecins() {
		System.out.println("1");
		return daoMedecin.getAllMedecins();
	}

	@Override
	public Medecin findByCode(int code) {
		return daoMedecin.findByCode(code);
	}

	@Override
	public boolean add(Medecin m) {
		return daoMedecin.add(m);
	}

	@Override
	public boolean update(Medecin m) {
		return daoMedecin.update(m);
	}

	@Override
	public boolean delete(Medecin m) {
		return daoMedecin.delete(m);
	}

}
