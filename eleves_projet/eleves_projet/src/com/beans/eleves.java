package com.beans;

public class eleves {
	


	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String niveau;
	
	
	public eleves() {
		
	}


	public eleves(String nom, String prenom, String adresse, String niveau) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.niveau = niveau;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	
	@Override
	public String toString() {
		return "eleves [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", niveau="
				+ niveau + "]";
	}

	
	

}
