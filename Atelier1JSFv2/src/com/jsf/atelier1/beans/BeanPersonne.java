package com.jsf.atelier1.beans;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

import com.jsf.atelier1.dao.DaoPersonne;
import com.jsf.atelier1.model.Personne;

@ManagedBean(name="beanPersonne")
@RequestScoped
public class BeanPersonne {

	private Personne personne;
	private List<Personne> personnes;
	private String cin;
	
	public Personne getPersonne() {
		return personne;
	}
	
	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(ArrayList<Personne> personnes) {
		this.personnes = personnes;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public BeanPersonne() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		personne = new Personne();
		personnes = DaoPersonne.getAllPersonne();
		
	}
		
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String EnregistrerPersonne() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		DaoPersonne.Save(personne);
		personne.setCin("");
		personne.setNom("");
		personne.setPrenom("");
		personne.setSexe("f");
		personnes = DaoPersonne.getAllPersonne();
		return "index";
	}
	
	public void affiche(ValueChangeEvent e) {
		System.out.println("cin :" + e.getNewValue());
	}
	
	public void modifier() {
		System.out.println(cin);
		
	}
	public void supprimer() {
		System.out.println(cin);
	}
	
	
}
