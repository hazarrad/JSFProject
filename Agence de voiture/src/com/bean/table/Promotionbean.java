package com.bean.table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="Promotionbean")
@RequestScoped

public class Promotionbean {

	public Promotionbean(int code, String date_debut, String date_fin) {
		super();
		this.code = code;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	private int code;
	private String date_debut;
	private String date_fin;
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
