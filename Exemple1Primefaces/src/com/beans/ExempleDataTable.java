package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.models.Client;

@ManagedBean(name="exempleDataTable")
@SessionScoped
public class ExempleDataTable {

	private List<Client> cls;
	private int idClient;

	public ExempleDataTable() {
		cls = new ArrayList<>();
		
		cls.add(new Client(1,"NCl1","PCl1"));
		cls.add(new Client(2,"NCl2","PCl2"));
		cls.add(new Client(3,"NCl3","PCl3"));
		cls.add(new Client(4,"NCl4","PCl4"));
	}
	
	public List<Client> getCls() {
		return cls;
	}

	public void setCls(List<Client> cls) {
		this.cls = cls;
	}
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public void remove() {
		for(int i=0;i<cls.size();i++) {
			if(cls.get(i).getId()==idClient)
				cls.remove(i);
		}
	}
	
}
