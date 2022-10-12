package com.bean.table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="Marquebean")
@RequestScoped

public class Marquebean {

	private int code;
	private String libelle;
	public Marquebean(int code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
