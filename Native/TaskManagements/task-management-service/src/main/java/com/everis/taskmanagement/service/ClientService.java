package com.everis.taskmanagement.service;

import com.everis.taskmanagement.dto.ClientDTO;

public interface ClientService extends GenericService<ClientDTO, Long>{
	
	ClientDTO getByPK(Long id);

}
