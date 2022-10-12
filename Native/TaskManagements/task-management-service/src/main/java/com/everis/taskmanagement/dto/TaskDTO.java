package com.everis.taskmanagement.dto;

import java.util.Date;
import com.everis.taskmanagement.enums.TaskType;

public class TaskDTO {
	
	private long id;
	
	private String name;
	
    private Date startDate;
	
	private Date endDate;
	
	private Double duration;
	
	private TaskType type;
	
	private String description;

	public TaskDTO()
	{
		super();
	}

	public TaskDTO(String name, Date startDate, Date endDate, Double duration,
			TaskType type, String description) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.type = type;
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

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", duration="
				+ duration + ", type=" + type + ", description=" + description + "]";
	}

}
