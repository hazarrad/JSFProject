package com.everis.taskmanagement.dto;

import java.util.Date;

import com.everis.taskmanagement.model.Employee;

public class ProjectDTO {
	
	
	private long id;
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;	
	
	private String description;

	public ProjectDTO() {
		super();
	}

	
	public ProjectDTO(String name, Date startDate, Date endDate, String description) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}


	public ProjectDTO(String name, Date startDate, Date endDate, Employee responsable, String description) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	
	public ProjectDTO(long id, String name, Date startDate, Date endDate, String description) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
}
