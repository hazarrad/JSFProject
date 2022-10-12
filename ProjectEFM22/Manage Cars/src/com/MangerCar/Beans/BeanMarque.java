package com.MangerCar.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ManagerCar.utils.HibernateUtile;
import com.MangerCar.Dao.DaoMaruqe;
import com.MangerCar.Entity.Marque;

@ManagedBean(name="beanMarque")
@SessionScoped
public class BeanMarque {

	
	
	
	
	
	private Marque marque;
	private List<Marque> LMarque;
	
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public List<Marque> getLMarque() {
		return LMarque;
	}
	public void setLMarque(List<Marque> lMarque) {
		LMarque = lMarque;
	}
	
	public BeanMarque() throws Exception {
	
		Marque c = new Marque();
		c.setLibelle("lolipop");
		
		LMarque=new ArrayList<>();
		LMarque=DaoMaruqe.getAllMarque();
		
		
		
	}
	
	
	
}
