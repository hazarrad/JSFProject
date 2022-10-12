package com.everis.taskmanagement.service;

import com.everis.taskmanagement.dto.ProjectDTO;

public interface ProjectService extends GenericService<ProjectDTO, Long>{
	ProjectDTO getByPK(Long id);

	
 ProjectDTO getvalueById(Long id) throws Exception ;
	
}
