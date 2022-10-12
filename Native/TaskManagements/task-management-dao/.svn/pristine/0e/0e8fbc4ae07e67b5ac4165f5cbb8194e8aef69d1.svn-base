package com.everis.taskmanagement.dao;

import java.util.List;

import com.everis.taskmanagement.model.Client;

public interface GenericDAO<T,K> {
	
	public T create (T t) throws Exception;
	
	public List<T> getAll();
	
	public T udpate (K k, T t);
	
	public void delete (K k) throws Exception;
	
	public T getById(K k) throws Exception;

}
