package com.personne.info;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "pers")
@SessionScoped

public class personne {

	private String CIN;
	private String NOM;
	private String PRENOM;
	private String SEXE;

	public personne(String cIN, String nOM, String pRENOM, String sEXE) {
		super();
		CIN = cIN;
		NOM = nOM;
		PRENOM = pRENOM;
		SEXE = sEXE;
	}

	public personne() {

	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
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

	public String getSEXE() {
		return SEXE;
	}

	public void setSEXE(String sEXE) {
		SEXE = sEXE;
	}

}
