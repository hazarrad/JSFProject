package com.vol.entities;

import java.util.Date;

public class Vol {
	
	private int id;
	private Date dateVol;
	private int heureDecalage;
	private int minuteDecalage;
	private int idPilote;
	private int idAvion;
	private int idTrajet;
	
	public Vol() {
		
	}
	
	public Vol(int id, Date dateVol, int heureDecalage, int minuteDecalage, int idPilote, int idAvion, int idTrajet) {
		super();
		this.id = id;
		this.dateVol = dateVol;
		this.heureDecalage = heureDecalage;
		this.minuteDecalage = minuteDecalage;
		this.idPilote = idPilote;
		this.idAvion = idAvion;
		this.idTrajet = idTrajet;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateVol() {
		return dateVol;
	}
	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
	}
	public int getHeureDecalage() {
		return heureDecalage;
	}
	public void setHeureDecalage(int heureDecalage) {
		this.heureDecalage = heureDecalage;
	}
	public int getMinuteDecalage() {
		return minuteDecalage;
	}
	public void setMinuteDecalage(int minuteDecalage) {
		this.minuteDecalage = minuteDecalage;
	}
	public int getIdPilote() {
		return idPilote;
	}
	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}
	public int getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	public int getIdTrajet() {
		return idTrajet;
	}
	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", dateVol=" + dateVol + ", heureDecalage=" + heureDecalage + ", minuteDecalage="
				+ minuteDecalage + ", idPilote=" + idPilote + ", idAvion=" + idAvion + ", idTrajet=" + idTrajet + "]";
	}
}
