package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.TechnologyDTO;
import com.everis.taskmanagement.model.Technology;

public class TechnologyTransformer extends AbstractTransformer<TechnologyDTO, Technology>{

	@Override
	public TechnologyDTO toDTO(Technology entity) {
		TechnologyDTO dto = new TechnologyDTO();
		
		dto.setName(entity.getName());
		
		return dto;
	}

	@Override
	public Technology toEntity(TechnologyDTO dto) {
		Technology entity = new Technology();
		
		entity.setName(dto.getName());
		
		return entity;
	}

}
