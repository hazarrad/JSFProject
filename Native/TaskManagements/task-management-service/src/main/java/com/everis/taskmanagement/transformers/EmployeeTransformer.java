package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.EmployeeDTO;
import com.everis.taskmanagement.enums.Grade;
import com.everis.taskmanagement.enums.Profile;
import com.everis.taskmanagement.model.Employee;

public class EmployeeTransformer extends AbstractTransformer<EmployeeDTO, Employee>{

	@Override
	public EmployeeDTO toDTO(Employee entity) {
		EmployeeDTO dto = new EmployeeDTO();

		dto.setNumber(entity.getNumber());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setGrade(fromStringToEnumGrade(entity.getGrade()));
		dto.setEmail(entity.getEmail());
		dto.setPassword(entity.getPassword());
		dto.setProfile(fromStringToEnumProfile(entity.getProfile()));
		dto.setIntergrationDate(entity.getIntergrationDate());
		
		return dto;
	}

	
	@Override
	public Employee toEntity(EmployeeDTO dto) {
		Employee entity = new Employee();
		
		entity.setNumber(dto.getNumber());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setGrade(fromEnumToStringGrade(dto.getGrade()));
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setProfile(fromEnumToStringProfile(dto.getProfile()));
		entity.setIntergrationDate(dto.getIntergrationDate());
		
		return entity;
	}
	
	

	public Grade fromStringToEnumGrade(String grade)
	{
		if(grade.equals("CJ")) return Grade.CJ;
		if(grade.equals("CD")) return Grade.CD;
		if(grade.equals("CSD")) return Grade.CSD;
		if(grade.equals("CLD")) return Grade.CLD;
		return null;
	}
	
	public String fromEnumToStringGrade(Grade grade)
	{
		if(grade.equals(Grade.CJ)) return "CJ";
		if(grade.equals(Grade.CD)) return "CD";
		if(grade.equals(Grade.CSD)) return "CSD";
		if(grade.equals(Grade.CLD)) return "CLD";
		return null;
	}
	
	
	public Profile fromStringToEnumProfile(String profile)
	{
		if(profile.equals("ADMIN")) return Profile.ADMIN;
		if(profile.equals("USER")) return Profile.USER;

		return null;
	}
	
	public String fromEnumToStringProfile(Profile profile)
	{
		if(profile.equals(Profile.ADMIN)) return "ADMIN";
		if(profile.equals(Profile.USER)) return "USER";

		return null;
	}
}
