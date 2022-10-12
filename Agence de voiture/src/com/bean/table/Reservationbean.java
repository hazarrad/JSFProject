package com.bean.table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="Resevationbean")
@RequestScoped


public class Reservationbean {
	
	private int code;
	private String date_res;
	private String etat;
	private String date_debut;
	private String date_fin;
	public int getCode() {
		return code;
	}
	public Reservationbean(int code, String date_res, String etat, String date_debut, String date_fin) {
		super();
		this.code = code;
		this.date_res = date_res;
		this.etat = etat;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDate_res() {
		return date_res;
	}
	public void setDate_res(String date_res) {
		this.date_res = date_res;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
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
