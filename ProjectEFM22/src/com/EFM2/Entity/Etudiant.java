package com.EFM2.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_FIL")
	private Filiere filiere;

	public Etudiant(int id, String nom, String prenom, Filiere filiere) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}

	public Etudiant() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
}