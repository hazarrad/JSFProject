package com.beans;

public class utilisateur {
	
	private int id;
	private String nom;
	private String pr�nom;
	private String login;
	private String password;
	private String email;
	
	public utilisateur() {
		
	}
	

	public utilisateur(String nom, String pr�nom, String login, String password, String email) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
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

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
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
