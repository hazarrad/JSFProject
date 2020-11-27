package com.EFM2.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.EFM2.Entity.Filiere;
import com.jEFM2.Dao.DaoEtudiant;

@ManagedBean(name="beanFiliere")
@SessionScoped
public class BeanFiliere {
	
	private Filiere filiere;
	private List<Filiere> lfil;
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public List<Filiere> getLfil() {
		return lfil;
	}
	public void setLfil(List<Filiere> lfil) {
		this.lfil = lfil;
	}
	
	public BeanFiliere() {
		filiere=new Filiere();
		
		lfil=new ArrayList<Filiere>();
		lfil=DaoEtudiant.getAllfil();
	}
	

}
