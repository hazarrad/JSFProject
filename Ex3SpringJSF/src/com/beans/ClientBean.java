package com.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.entities.Client;
import com.services.IService;

@ManagedBean(name="clientBean")
@Component
@SessionScoped
public class ClientBean {

	@Autowired
	IService service;
	
	public List<Client> getClts(){
		return service.getAllClient();
	}
}