package com.vol.entities;

import java.util.Date;

public class Avion {

	private int id;
	private String compagnie;
	private String type;
	private Date dateMiseMarche;
	
	public Avion() {
		
	}
	
	public Avion(int id, String compagnie, String type, Date dateMiseMarche) {
		this.id = id;
		this.compagnie = compagnie;
		this.type = type;
		this.dateMiseMarche = dateMiseMarche;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateMiseMarche() {
		return dateMiseMarche;
	}
	public void setDateMiseMarche(Date dateMiseMarche) {
		this.dateMiseMarche = dateMiseMarche;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", compagnie=" + compagnie + ", type=" + type + ", dateMiseMarche=" + dateMiseMarche
				+ "]";
	}
}
