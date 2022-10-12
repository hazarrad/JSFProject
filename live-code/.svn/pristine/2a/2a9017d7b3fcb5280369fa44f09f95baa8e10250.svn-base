package com.everis.day7.generics;

import java.util.List;
import java.util.Optional;

public interface GenericDAO<K, T> {
	
	T create(T t) throws Exception ;
	
	T update(K k, T t);
	
	void delete(K v) throws Exception ;
		
	Optional<T> getById(K k);
	
	List<T> getAll();

}
