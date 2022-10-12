package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.dao.DaoClient;
import com.models.Client;

@ManagedBean(name="exempleDataTable")
@SessionScoped
public class ExempleDataTable {

	private List<Client> cls;
	private int idClient;
	private String nom; 
	private String prenom;

	public ExempleDataTable() {
		cls = DaoClient.getAll();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Client> getCls() {
		return cls;
	}

	public void setCls(List<Client> cls) {
		this.cls = cls;
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public void remove() {
		for(int i=0;i<cls.size();i++) {
			if(cls.get(i).getId()==idClient)
				cls.remove(i);
		}
	}
	
	public void ajouter() {
		Client c = new Client(1,nom,prenom);
		
		DaoClient.AddClient(c);
		
		cls = DaoClient.getAll();
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Inserer avec succes", null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	
}
