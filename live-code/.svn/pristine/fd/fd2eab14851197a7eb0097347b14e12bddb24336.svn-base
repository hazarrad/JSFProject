package com.everis.day6.polymorphism.transformers;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTransformer {

	public abstract Object toDTO(Object object);

	public abstract Object toEntity(Object object);

	public List<Object> toDTOList(List<Object> objectList) {
		List<Object> objectDTOList = new ArrayList<Object>();

		for (Object object : objectList) {
			objectDTOList.add(toDTO(object));
		}

		return objectDTOList;
	}

	public List<Object> toEntityList(List<Object> objectDTOList) {
		List<Object> objectList = new ArrayList<Object>();

		for (Object object : objectDTOList) {
			objectList.add(toEntity(object));
		}

		return objectList;
	}
}
