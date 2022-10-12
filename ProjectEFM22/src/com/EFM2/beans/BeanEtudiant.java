package com.EFM2.beans;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;

import com.EFM2.Entity.Etudiant;
import com.EFM2.Entity.Filiere;
import com.jEFM2.Dao.DaoEtudiant;


@ManagedBean(name = "mybean")
@SessionScoped
public class BeanEtudiant  {

	private Etudiant etudiant;
	private List<Etudiant> LEtudiant;

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getLEtudiant() {
		return LEtudiant;
	}

	public void setLEtudiant(List<Etudiant> lEtudiant) {
		LEtudiant = lEtudiant;
	}


	public BeanEtudiant() {
		etudiant = new Etudiant();

		LEtudiant = new ArrayList<Etudiant>();
		LEtudiant = DaoEtudiant.getAllEtudiant();
	
	}
	
	
	public void AddEtudiant() {
		etudiant=new Etudiant();
		etudiant.getId();
		etudiant.getNom();
		etudiant.getPrenom();
		etudiant.getFiliere();
		DaoEtudiant.AddEtudiant(etudiant);
	}
	

}
