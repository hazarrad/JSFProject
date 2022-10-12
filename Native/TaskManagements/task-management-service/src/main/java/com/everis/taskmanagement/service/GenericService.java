package com.everis.taskmanagement.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, K> {
	
	T create(T t) throws Exception ;
	
	T update(K k, T t);
	
	void delete(K v) throws Exception ;
		
	Optional<T> getById(K k);
	
	List<T> getAll();
	

}
