package com.mapping.table;

public class Voiture {

	private int code;
	private String matricule;
	private String categorie;
	private String types;
	private String prix;
	
	
	
	public Voiture(int code, String matricule, String categorie, String types, String prix) {
		super();
		this.code = code;
		this.matricule = matricule;
		this.categorie = categorie;
		this.types = types;
		this.prix = prix;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
	
}
