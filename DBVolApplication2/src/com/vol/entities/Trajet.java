package com.vol.entities;

public class Trajet {

	private int id;
	private String aeroportDepart; 
	private String aeroportArrivee;
	private int dureeVol;
	
	public Trajet() {
		
	}
	
	public Trajet(int id, String aeroportDepart, String aeroportArrivee, int dureeVol) {
		this.id = id;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.dureeVol = dureeVol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAeroportDepart() {
		return aeroportDepart;
	}
	public void setAeroportDepart(String aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}
	public String getAeroportArrivee() {
		return aeroportArrivee;
	}
	public void setAeroportArrivee(String aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}
	public int getDureeVol() {
		return dureeVol;
	}
	public void setDureeVol(int dureeVol) {
		this.dureeVol = dureeVol;
	}

	@Override
	public String toString() {
		return "Trajet [id=" + id + ", aeroportDepart=" + aeroportDepart + ", aeroportArrivee=" + aeroportArrivee
				+ ", dureeVol=" + dureeVol + "]";
	}
	
	
}
