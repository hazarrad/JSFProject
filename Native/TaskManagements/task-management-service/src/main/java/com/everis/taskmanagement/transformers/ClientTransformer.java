package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.ClientDTO;
import com.everis.taskmanagement.model.Client;

public class ClientTransformer extends AbstractTransformer<ClientDTO, Client>{

	@Override
	public ClientDTO toDTO(Client entity) {
		ClientDTO dto = new ClientDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPhone(entity.getPhone());
		
		return dto;
	}

	@Override
	public Client toEntity(ClientDTO dto) {
		Client entity = new Client();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPhone(dto.getPhone());
		
		return entity;
	}

}
