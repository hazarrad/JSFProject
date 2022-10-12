package com.everis.taskmanagement.transformers;

import com.everis.taskmanagement.dto.TaskDTO;
import com.everis.taskmanagement.enums.TaskType;
import com.everis.taskmanagement.model.Task;


public class TaskTransformer extends AbstractTransformer<TaskDTO, Task>{

	@Override
	public TaskDTO toDTO(Task entity) {
		TaskDTO dto = new TaskDTO();
		
		dto.setName(entity.getName());
		dto.setStartDate(entity.getStartDate());
		dto.setEndDate(entity.getEndDate());
		dto.setDuration(entity.getDuration());
		dto.setType(fromStringToEnumTaskType(entity.getType()));
		dto.setDescription(entity.getDescription());
		
		return dto;
	}

	
	@Override
	public Task toEntity(TaskDTO dto) {
		Task entity = new Task();
		
		entity.setName(dto.getName());
		entity.setStartDate(dto.getStartDate());
		entity.setEndDate(dto.getEndDate());
		entity.setDuration(dto.getDuration());
		entity.setType(fromEnumToStringTaskType(dto.getType()));
		entity.setDescription(dto.getDescription());
		
		return entity;
	}
	
	
	public TaskType fromStringToEnumTaskType(String taskType)
	{
		if(taskType.equals("DAVLOPEMENT")) return TaskType.DAVLOPEMENT;
		if(taskType.equals("VACATION")) return TaskType.VACATION;
		if(taskType.equals("CENTER_TRAINING")) return TaskType.CENTER_TRAINING;
		if(taskType.equals("CLIENT_TRAINING")) return TaskType.CLIENT_TRAINING;

		return null;
	}
	
	public String fromEnumToStringTaskType(TaskType taskType)
	{
		if(taskType.equals(TaskType.DAVLOPEMENT)) return "DAVLOPEMENT";
		if(taskType.equals(TaskType.VACATION)) return "VACATION";
		if(taskType.equals(TaskType.CENTER_TRAINING)) return "CENTER_TRAINING";
		if(taskType.equals(TaskType.CLIENT_TRAINING)) return "CLIENT_TRAINING";

		return null;
	}

}
