package com.mapping.table;

public class Location {
	
	private int code;
	private String date_debut;
	private String date_fin;
	private String tarif;
	private String nbr_jour;
	
	
	
	public Location(int code, String date_debut, String date_fin, String tarif, String nbr_jour) {
		super();
		this.code = code;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.tarif = tarif;
		this.nbr_jour = nbr_jour;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	public String getTarif() {
		return tarif;
	}
	public void setTarif(String tarif) {
		this.tarif = tarif;
	}
	public String getNbr_jour() {
		return nbr_jour;
	}
	public void setNbr_jour(String nbr_jour) {
		this.nbr_jour = nbr_jour;
	}
	
	


}
