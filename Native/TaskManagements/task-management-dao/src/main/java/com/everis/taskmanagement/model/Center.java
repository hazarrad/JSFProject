package com.everis.taskmanagement.model;

public class Center {
	
	private Long id;
	
	private String name;
	
	private String city;
	
	public Center() {
		super();
	}
	
	public Center(String name,String city) {
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Center [name=" + name + ", city=" + city + "]";
	}


	

}
