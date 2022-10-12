package com.vol.entities;

import java.util.Date;

public class Pilote {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String tel;
	private Date dateNaissance;
	private Date dateEmbauche;
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Pilote(int id, String nom, String prenom, String adresse, String tel, Date dateNaissance, Date dateEmbauche) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
	}
	
	public Pilote() {
	}
	
	@Override
	public String toString() {
		return "Vol [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel
				+ ", dateNaissance=" + dateNaissance + ", dateEmbauche=" + dateEmbauche + "]";
	}
}
