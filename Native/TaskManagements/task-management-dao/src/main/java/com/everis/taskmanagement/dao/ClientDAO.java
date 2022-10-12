package com.everis.taskmanagement.dao;

import com.everis.taskmanagement.model.Client;

public interface ClientDAO extends GenericDAO<Client,Long>{
	
	Client getByPK(Long id);
	


}
