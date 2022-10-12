package com.beans;

public class utilisateur {
	
	private int id;
	private String nom;
	private String prénom;
	private String login;
	private String password;
	private String email;
	
	public utilisateur() {
		
	}
	

	public utilisateur(String nom, String prénom, String login, String password, String email) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.login = login;
		this.password = password;
		this.email = email;
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

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
