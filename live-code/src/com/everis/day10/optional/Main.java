package com.everis.day10.optional;

import java.util.Optional;

import com.everis.day6.inheritance.Employee;

public class Main {

	public static void main(String[] args) {

		// Optional<Employee> oEmployee = null;
		// Optional<Employee> oEmployee = Optional.of(null);
		Employee employee = new Employee();
		Optional<Employee> oEmployee = Optional.of(employee);

		Employee employeeFromO = getEmployee(oEmployee);
		// Employee employeeFromO = oEmployee.get();
		System.out.println(employeeFromO);
		System.out.println(oEmployee.orElse(new Employee()));
		//System.out.println(oEmployee.orElseGet( /*appel à une methode*/));
		//System.out.println(oEmployee.orElseThrow(/*appel à une methode qui throws une exception*/));

	}

	private static Employee getEmployee(Optional<Employee> oEmployee) {

		return oEmployee.get();
	}

}
