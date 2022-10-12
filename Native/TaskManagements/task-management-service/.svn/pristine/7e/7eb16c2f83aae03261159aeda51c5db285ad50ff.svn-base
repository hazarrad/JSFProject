package com.everis.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import com.everis.taskmanagement.dao.ClientDAO;
import com.everis.taskmanagement.dao.EmployeeDAO;
import com.everis.taskmanagement.dto.ClientDTO;
import com.everis.taskmanagement.dto.EmployeeDTO;
import com.everis.taskmanagement.model.Client;
import com.everis.taskmanagement.model.Employee;
import com.everis.taskmanagement.service.ClientService;
import com.everis.taskmanagement.transformers.ClientTransformer;
import com.everis.taskmanagement.transformers.EmployeeTransformer;

public class ClientServiceImpl implements ClientService{

	private ClientDAO clientDAO;

	private ClientTransformer transformer = new ClientTransformer();

	
	  public ClientServiceImpl(ClientDAO clientDAO) { 
		  this.clientDAO = clientDAO; 
		  }
	
	@Override
	public ClientDTO create(ClientDTO t) throws Exception {
		
		Client clientToCreate = transformer.toEntity(t);

		Client createdClient = clientDAO.create(clientToCreate);

		ClientDTO createdClientDTO = transformer.toDTO(createdClient);

		return createdClientDTO;
	}

	public ClientDTO update(Long k, ClientDTO t) {
		
		Client clientToUpdate = transformer.toEntity(t);

		Client updatedClient = clientDAO.udpate(k, clientToUpdate);
		
		ClientDTO updatedClientDTO = transformer.toDTO(updatedClient);

		return updatedClientDTO;
	}

	public void delete(Long v) throws Exception {
		clientDAO.delete(v);
	}

	public Optional<ClientDTO> getById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientDTO> getAll() {
		
		List<Client> clientList = clientDAO.getAll();

		List<ClientDTO> clientDTOList = transformer.toDTOList(clientList);

		return clientDTOList;
	}

	@Override
	public ClientDTO getByPK(Long id) {
		
		Client client = clientDAO.getByPK(id);

		ClientDTO clientFound = transformer.toDTO(client);

		return clientFound;
	}

}
