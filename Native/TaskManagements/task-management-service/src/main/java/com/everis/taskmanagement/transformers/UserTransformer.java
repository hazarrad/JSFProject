package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.UserDTO;
import com.everis.taskmanagement.model.User;

public class UserTransformer extends AbstractTransformer<UserDTO, User>{

	@Override
	public UserDTO toDTO(User entity) {
		UserDTO dto = new UserDTO();
		
		dto.setUsername(entity.getUsername());
		dto.setPassword(entity.getPassword());
		
		return dto;
	}

	@Override
	public User toEntity(UserDTO dto) {
		User entity = new User();
		
		entity.setUsername(dto.getUsername());
		entity.setPassword(dto.getPassword());
		
		return entity;
	}

}
