package com.MangerCar.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "marque")
public class Marque {

	/*@Id
	@GeneratedValue
	@Column(name = "code")*/
	private int code;

	public Marque() {

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	//@Column(name = "libelle")
	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Marque(int code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	
	
}
