package com.EFM2.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.EFM2.Entity.Etudiant;
import com.jEFM2.Dao.DaoEtudiant;

@ManagedBean(name = "beanEtudiant")
@SessionScoped
public class BeanEtudiant {

	private Etudiant etudiant;
	private List<Etudiant> LEtudiant;

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getLEtudiant() {
		return LEtudiant;
	}

	public void setLEtudiant(List<Etudiant> lEtudiant) {
		LEtudiant = lEtudiant;
	}

	public BeanEtudiant() {
		etudiant = new Etudiant();

		LEtudiant = new ArrayList<Etudiant>();
		LEtudiant = DaoEtudiant.getAlletudiant();

	}

	public String saveUser() {
		DaoEtudiant dao = new DaoEtudiant();
		Etudiant et = new Etudiant(etudiant.getId(), etudiant.getNom(), etudiant.getPrenom(), etudiant.getID_FIL());
		dao.save(et);
		System.out.println("User successfully saved.");
		return "output";
	}

	public void delete() {

		DaoEtudiant.delete(etudiant.getId());
	}

	public void update() {

		DaoEtudiant.update(etudiant);
	}

	public void update2() {
		Etudiant e = new Etudiant();
		DaoEtudiant sdao = new DaoEtudiant();
		sdao.updateStudent(e);
	}

}
