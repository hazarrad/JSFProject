package com.rv.iservice;

import java.util.List;

import com.rv.entities.Medecin;

public interface IServiceMedecin {
	
	List<Medecin> getAllMedecins();
	Medecin findByCode(int code); 
	boolean add(Medecin m);
	boolean update(Medecin m);
	boolean delete(Medecin m);
}
