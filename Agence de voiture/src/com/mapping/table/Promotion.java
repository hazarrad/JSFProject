package com.mapping.table;

public class Promotion {
	
	private int code;
	private String date_debut;
	private String date_fin;
	
	
	
	public Promotion(int code, String date_debut, String date_fin) {
		super();
		this.code = code;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
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
	
	
	

}
