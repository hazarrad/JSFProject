package com.EFM2.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "filiere")
public class Filiere implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "id_fil")
	private int id_fil;
	
	@Column(name = "libelle")
	private String libelle;
	
	@Column(name = "niveau")
	private String niveau;
	

	public Filiere() {
	}

	public int getId_fil() {
		return id_fil;
	}

	public void setId_fil(int id_fil) {
		this.id_fil = id_fil;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
}