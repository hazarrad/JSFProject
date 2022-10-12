package com.everis.day7.generics;

import java.util.List;
import java.util.Optional;

public class GenericDAOImpl<K, T> implements GenericDAO<K, T> {

	@Override
	public T create(T t) throws Exception {
		System.out.println("Element created");
		System.out.println("Green Conflict");
		return t;
	}

	@Override
	public T update(K k, T t) {
		try {
			System.out.println("Element updated");
		} catch (Exception e) {
			System.out.println("DataBase no t available");
		}
		return t;
	}

	@Override
	public void delete(K v) throws Exception {
		System.out.println("Element deleted");
		System.out.println("This is the RED CONFLICT");
		System.out.println("Red Conflict");
	}

	@Override
	public Optional<T> getById(K k) {

		System.out.println("Element got");
		return Optional.of(null);
	}

	@Override
	public List<T> getAll() {
		System.out.println("Enjoy with the whole DataBase :)");
		System.out.println("Another Green Conflict");
		return null;
	}

}
