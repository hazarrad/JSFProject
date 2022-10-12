package com.projectEmploye_jsf.Beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.projectEmploye_jsf.Entity.Employe;
import com.projectEmploye_jsf.Service.IService;
import com.projectEmploye_jsf.Service.ServiceEmploye;

@ManagedBean(name = "beanEmploye")
@SessionScoped
public class BeanEmploye {

	public IService service = new ServiceEmploye();
	public Employe employe = new Employe();
	Employe myemp;

	public List<Employe> getall() {
		return service.getAll();

	}
	
	

	public void saveUser() {
		
		service.save(employe);
		
	}
	
	
public void remove() {
		
		service.delete(employe.getId());
		
	}


public void update() {
	
	service.update(employe);
	
}
}


