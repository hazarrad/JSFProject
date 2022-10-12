package com.everis.taskmanagement.dao;

import com.everis.taskmanagement.model.Project;

public interface ProjectDAO extends GenericDAO<Project,Long>{
	Project getByPK(Long id);

	Project getvalueById(Long id) throws Exception ;

}
