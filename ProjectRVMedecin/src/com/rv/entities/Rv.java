package com.rv.entities;
// Generated 20 juil. 2019 10:43:59 by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Rv generated by hbm2java
 */
@Entity
@Table(name = "rv", catalog = "dbRdMedecins")
public class Rv implements java.io.Serializable {

	private Integer numero;
	private Date dateRv;
	private String heureRv;
	private Integer codeMedecin;
	private Integer codePatient;

	public Rv() {
	}

	public Rv(Date dateRv, String heureRv, Integer codeMedecin, Integer codePatient) {
		this.dateRv = dateRv;
		this.heureRv = heureRv;
		this.codeMedecin = codeMedecin;
		this.codePatient = codePatient;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "numero", unique = true, nullable = false)
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateRV", length = 10)
	public Date getDateRv() {
		return this.dateRv;
	}

	public void setDateRv(Date dateRv) {
		this.dateRv = dateRv;
	}

	@Column(name = "HeureRV", length = 35)
	public String getHeureRv() {
		return this.heureRv;
	}

	public void setHeureRv(String heureRv) {
		this.heureRv = heureRv;
	}

	@Column(name = "codeMedecin")
	public Integer getCodeMedecin() {
		return this.codeMedecin;
	}

	public void setCodeMedecin(Integer codeMedecin) {
		this.codeMedecin = codeMedecin;
	}

	@Column(name = "codePatient")
	public Integer getCodePatient() {
		return this.codePatient;
	}

	public void setCodePatient(Integer codePatient) {
		this.codePatient = codePatient;
	}

}
