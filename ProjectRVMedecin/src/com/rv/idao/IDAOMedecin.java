package com.rv.idao;

import java.util.List;

import com.rv.entities.Medecin;

public interface IDAOMedecin {

	List<Medecin> getAllMedecins();
	Medecin findByCode(int code); 
	boolean add(Medecin m);
	boolean update(Medecin m);
	boolean delete(Medecin m);
}
