package com.everis.taskmanagement.service;

import com.everis.taskmanagement.dto.EmployeeDTO;

public interface EmployeeService extends GenericService<EmployeeDTO, Long> {
	
	EmployeeDTO getByPK(Long id);

}
