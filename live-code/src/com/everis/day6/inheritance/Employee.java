package com.everis.day6.inheritance;

public class Employee extends Person { // IS-A

	private String matricule; // HAS-A
	private Grad grad; // HAS-A

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Grad getGrad() {
		return grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	@Override
	public String toString() {
		return "Employee [matricule=" + matricule + ", grad=" + grad + "]";
	}
	
	

}
