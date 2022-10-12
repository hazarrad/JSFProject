package com.rv.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.rv.entities.Medecin;
import com.rv.idao.IDAOMedecin;
import com.rv.iservice.IServiceMedecin;

@ManagedBean
@Component("medecinBean")
@SessionScoped
public class MedecinBean {

	@Autowired
	IServiceMedecin serviceMedecin;
	
	public List<Medecin> getMedecins(){
		return serviceMedecin.getAllMedecins();
	}
}
