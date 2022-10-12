package com.everis.day6.polymorphism.transformers;

public class OrdinateurDTO {
	private int memory;
	private int HDD;
	private String brand;

	public OrdinateurDTO(int memory, int hDD, String brand) {
		super();
		this.memory = memory;
		HDD = hDD;
		this.brand = brand;
	}

	public OrdinateurDTO() {
		super();
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "OrdinateurDTO [memory=" + memory + ", HDD=" + HDD + ", brand=" + brand + "]";
	}

}
