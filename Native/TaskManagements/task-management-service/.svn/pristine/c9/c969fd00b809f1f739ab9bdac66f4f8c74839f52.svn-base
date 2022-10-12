package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.CenterDTO;
import com.everis.taskmanagement.model.Center;

public class CenterTransformer extends AbstractTransformer<CenterDTO, Center>{

	@Override
	public CenterDTO toDTO(Center entity) {
		CenterDTO dto = new CenterDTO();
		
		dto.setName(entity.getName());
		
		return dto;
	}

	@Override
	public Center toEntity(CenterDTO dto) {
		Center entity = new Center();
		
		entity.setName(dto.getName());
		
		return entity;
	}

}
