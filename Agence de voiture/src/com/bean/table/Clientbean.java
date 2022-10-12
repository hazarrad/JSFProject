package com.bean.table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mapping.table.Client;

@ManagedBean(name="clientbean")
@RequestScoped

public class Clientbean {

	private int code;
	private String nom;
	private String prenom;
	private String adresse;
	private String pays;
	private String ville;
	private String cin;
	private String email;
	private String tel;
	
	private Client client;

	public Clientbean() {

	}

	public Clientbean(int code, String nom, String prenom, String adresse, String pays, String ville, String cin,
			String email, String tel) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.pays = pays;
		this.ville = ville;
		this.cin = cin;
		this.email = email;
		this.tel = tel;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	public void Affichiernom() {
		System.out.println("hello world");
	}
}
