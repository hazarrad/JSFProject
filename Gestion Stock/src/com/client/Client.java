package com.client;

public class Client {

	private int idClient;
	private String nom;
	private String prenom;
	private String datenaissance;
	private String adresse;
	private int codepostal;
	private String ville;
	private String pays;
	private int telephone;
	private String email;
	
	
	public Client(){
		
	}
	
	
	
	public Client(int idClient, String nom, String prenom, String datenaissance, String adresse, int codepostal,
			String ville, String pays, int telephone, String email) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.adresse = adresse;
		this.codepostal = codepostal;
		this.ville = ville;
		this.pays = pays;
		this.telephone = telephone;
		this.email = email;
	}



	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "stock [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", datenaissance="
				+ datenaissance + ", adresse=" + adresse + ", codepostal=" + codepostal + ", ville=" + ville + ", pays="
				+ pays + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
	
}
