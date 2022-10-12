package com.everis.taskmanagement.dto;

import java.time.LocalDate;
import java.util.Date;

import com.everis.taskmanagement.enums.Grade;
import com.everis.taskmanagement.enums.Profile;

public class EmployeeDTO {
	
	private long id;
	
	private int number;
	
	private String firstName;
	
	private String lastName;
	
	private Grade grade;
	
	private String email;
	
	private String password;
	
	private Profile profile;
	
	private LocalDate intergrationDate;
	
	public EmployeeDTO() {
		super();
	}
	
	public EmployeeDTO(int number, String firstName, String lasttName, Grade grade, String email,
			String password, Profile profile, LocalDate intergrationDate) {
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
	
	public Grade getGrade() {
		return grade;
	}
	
	public void setGrade(Grade grade) {
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
	
	public Profile getProfile() {
		return profile;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public LocalDate getIntergrationDate() {
		return intergrationDate;
	}
	
	public void setIntergrationDate(LocalDate date) {
		this.intergrationDate = date;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", grade=" + grade + ", email=" + email + ", password=" + password + ", profile=" + profile
				+ ", intergrationDate=" + intergrationDate + "]";
	}
}
