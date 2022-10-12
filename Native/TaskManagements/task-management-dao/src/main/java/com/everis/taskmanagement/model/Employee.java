package com.everis.taskmanagement.model;

import java.time.LocalDate;

public class Employee {
	
	private long id;
	
	private int number;
	
	private String firstName;
	
	private String lastName;
	
	private String grade;
	
	private String email;
	
	private String password;
	
	private String profile;
	
	private LocalDate intergrationDate;
	
	public Employee() {
		super();
	}
	
	public Employee(int number, String firstName, String lasttName, String grade, String email,
			String password, String profile, LocalDate intergrationDate) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lasttName;
		this.grade = grade;
		this.email = email;
		this.password = password;
		this.profile = profile;
		this.intergrationDate = intergrationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public LocalDate getIntergrationDate() {
		return intergrationDate;
	}
	
	public void setIntergrationDate(LocalDate intergrationDate) {
		this.intergrationDate = intergrationDate;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", grade=" + grade + ", email=" + email + ", password=" + password + ", profile=" + profile
				+ ", intergrationDate=" + intergrationDate + "]";
	}
}
