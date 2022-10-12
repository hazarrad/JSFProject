package com.mapping.table;

public class Compte {

	private int code;
	private String login;
	private String password;
	private String types;
	
	
	public Compte(int code, String login, String password, String types) {
		super();
		this.code = code;
		this.login = login;
		this.password = password;
		this.types = types;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
	
	
}
