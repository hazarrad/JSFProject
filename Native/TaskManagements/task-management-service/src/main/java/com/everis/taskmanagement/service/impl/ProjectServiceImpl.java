package com.everis.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import com.everis.taskmanagement.dao.ClientDAO;
import com.everis.taskmanagement.dao.ProjectDAO;
import com.everis.taskmanagement.dto.ClientDTO;
import com.everis.taskmanagement.dto.ProjectDTO;
import com.everis.taskmanagement.model.Client;
import com.everis.taskmanagement.model.Project;
import com.everis.taskmanagement.service.ProjectService;
import com.everis.taskmanagement.transformers.ClientTransformer;
import com.everis.taskmanagement.transformers.ProjectTransformer;

public class ProjectServiceImpl implements ProjectService {

	private ProjectDAO projectDAO;

	private ProjectTransformer transformer = new ProjectTransformer();

	public ProjectServiceImpl(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public ProjectDTO create(ProjectDTO t) throws Exception {

		Project projectToCreate = transformer.toEntity(t);

		Project createdProject = projectDAO.create(projectToCreate);

		ProjectDTO createdProjectDTO = transformer.toDTO(createdProject);

		return createdProjectDTO;
	}

	public ProjectDTO update(Long k, ProjectDTO t) {
		Project projectToUpdate = transformer.toEntity(t);

		Project updatedProject = projectDAO.udpate(k, projectToUpdate);
		
		ProjectDTO updatedProjectDTO = transformer.toDTO(updatedProject);

		return updatedProjectDTO;
	}

	public void delete(Long v) throws Exception {
		projectDAO.delete(v);

	}

	public Optional<ProjectDTO> getById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProjectDTO> getAll() {
		List<Project> projectList = projectDAO.getAll();

		List<ProjectDTO> projectDTOList = transformer.toDTOList(projectList);

		return projectDTOList;
	}

	@Override
	public ProjectDTO getByPK(Long id) {
		Project project= projectDAO.getByPK(id);

		ProjectDTO projectFound = transformer.toDTO(project);

		return projectFound;
	}

	@Override
	public ProjectDTO getvalueById(Long id) throws Exception {

		Project projects = projectDAO.getById(id);

		ProjectDTO projectsFound = transformer.toDTO(projects);

		return projectsFound;
	}

	


}
