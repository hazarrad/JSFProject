package com.personne.info;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.Dao.pesonne.DaoPersone;

@ManagedBean(name="beanper")
@SessionScoped

public class Beanperonne {

	private personne ps;
	private ArrayList<personne> per;
	
	
	



	public ArrayList<personne> getPer() {
		return per;
	}


	public void setPer(ArrayList<personne> per) {
		this.per = per;
	}


	public personne getPs() {
		return ps;
	}


	public void setPs(personne ps) {
		this.ps = ps;
	}


	public void Enregestrer() {

		try {
			DaoPersone.add(ps);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getpersonne() throws Exception {
		personne p=new personne();
		per=new ArrayList<>();
		per.add(new personne("p1","n1","pr1","f"));
		per.add(new personne("p2","n2","pr2","h"));
		per.add(new personne("p3","n3","pr3","f"));
		per.add(new personne("p4","n4","pr4","h"));
	}
}
