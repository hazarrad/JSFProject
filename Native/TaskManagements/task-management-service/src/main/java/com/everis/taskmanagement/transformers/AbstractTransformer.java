package com.everis.taskmanagement.transformers;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTransformer<D, E> {

	public abstract D toDTO(E entity);

	public abstract E toEntity(D dto);

	
	public List<D> toDTOList(List<E> entityList) {
		List<D> dtoList = new ArrayList<D>();

		for (E e : entityList) {
			dtoList.add(toDTO(e));
		}

		return dtoList;
	}

	
	public List<E> toEntityList(List<D> dtoList) {
		List<E> entityList = new ArrayList<E>();

		for (D d : dtoList) {
			entityList.add(toEntity(d));
		}

		return entityList;
	}
}
