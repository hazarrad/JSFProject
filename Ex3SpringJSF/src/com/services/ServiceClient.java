package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IDao;
import com.entities.Client;

@Service("service")
public class ServiceClient implements IService{

	@Autowired
	IDao daoClient;
	
	@Override
	public List<Client> getAllClient() {
		return daoClient.getAll();
	}

}
