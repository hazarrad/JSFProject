package com.projectEmploye_jsf.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employe")
public class Employe {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "NOM")
	private String NOM;

	@Column(name = "PRENOM")
	private String PRENOM;

	@Column(name = "TEL")
	private String TEL;

	@Column(name = "FONCTION")
	private String FONCTION;

	public Employe() {

	}

	public Employe(int id, String nOM, String pRENOM, String tEL, String fONCTION) {
		super();
		this.id = id;
		NOM = nOM;
		PRENOM = pRENOM;
		TEL = tEL;
		FONCTION = fONCTION;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNOM() {
		return NOM;
	}

	public void setNOM(String nOM) {
		NOM = nOM;
	}

	public String getPRENOM() {
		return PRENOM;
	}

	public void setPRENOM(String pRENOM) {
		PRENOM = pRENOM;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public String getFONCTION() {
		return FONCTION;
	}

	public void setFONCTION(String fONCTION) {
		FONCTION = fONCTION;
	}

}
