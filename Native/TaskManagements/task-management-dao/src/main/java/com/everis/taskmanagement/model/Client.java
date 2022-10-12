package com.everis.taskmanagement.model;

public class Client {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private int phone;
	
	public Client() {
		super();
	}
	
	public Client(Long id, String name, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	
	public Client (String name, String email, int phone) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}


}
