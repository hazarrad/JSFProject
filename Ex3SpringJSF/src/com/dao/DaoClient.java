package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entities.Client;

@Repository("daoClient")
@Transactional
public class DaoClient implements IDao {

	@Override
	public List<Client> getAll() {
		
		List<Client> cls = new ArrayList<>();
		
		cls.add(new Client(1,"HH1","KK1"));
		cls.add(new Client(2,"HH2","KK2"));
		cls.add(new Client(3,"HH3","KK3"));
		cls.add(new Client(4,"HH4","KK4"));
		
		return cls;
	}

}

