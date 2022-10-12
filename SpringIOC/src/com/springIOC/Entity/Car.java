package com.springIOC.Entity;


public class Car {

	private int id;
	private String nameCar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameCar() {
		return nameCar;
	}
	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	public Car(int id, String nameCar) {
		super();
		this.id = id;
		this.nameCar = nameCar;
	}
	public Car() {
		super();
	}
	
	
	
}
