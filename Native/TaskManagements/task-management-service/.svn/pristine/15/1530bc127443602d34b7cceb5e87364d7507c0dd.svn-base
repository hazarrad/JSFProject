package com.everis.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import com.everis.taskmanagement.dao.EmployeeDAO;
import com.everis.taskmanagement.dto.EmployeeDTO;
import com.everis.taskmanagement.model.Employee;
import com.everis.taskmanagement.service.EmployeeService;
import com.everis.taskmanagement.transformers.EmployeeTransformer;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO;

	private EmployeeTransformer transformer = new EmployeeTransformer();

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public EmployeeDTO create(EmployeeDTO t) throws Exception {
		
		Employee employeeToCreate = transformer.toEntity(t);

		Employee createdEmployee = employeeDAO.create(employeeToCreate);

		EmployeeDTO createdEmployeeDTO = transformer.toDTO(createdEmployee);

		return createdEmployeeDTO;
	}

	public EmployeeDTO update(Long k, EmployeeDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public EmployeeDTO getByPK(Long id) {
		
		return null;
	}

	public List<EmployeeDTO> getAll() {
		
		List<Employee> employeeList = employeeDAO.getAll();

		List<EmployeeDTO> employeeDTOList = transformer.toDTOList(employeeList);

		return employeeDTOList;
	}

	public Optional<EmployeeDTO> getById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

}
