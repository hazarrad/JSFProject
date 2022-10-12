package com.bean.table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="Pannebean")
@RequestScoped


public class Pannebean {

	private int code;
	private String date_panne;
	private String date_reparation;
	private String description;
	
	
	public Pannebean(int code, String date_panne, String date_reparation, String description) {
		super();
		this.code = code;
		this.date_panne = date_panne;
		this.date_reparation = date_reparation;
		this.description = description;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDate_panne() {
		return date_panne;
	}
	public void setDate_panne(String date_panne) {
		this.date_panne = date_panne;
	}
	public String getDate_reparation() {
		return date_reparation;
	}
	public void setDate_reparation(String date_reparation) {
		this.date_reparation = date_reparation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
