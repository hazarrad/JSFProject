package com.everis.taskmanagement.dto;

public class TechnologyDTO {
	
    private Long id;
	
	private String name;
	
	public TechnologyDTO() {
		super();
	}
	
	public TechnologyDTO(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Technologie [name=" + name + "]";
	}
}
