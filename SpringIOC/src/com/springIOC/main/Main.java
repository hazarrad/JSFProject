package com.springIOC.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springIOC.Entity.Car;
import com.springIOC.conf.Appconfiguration;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfiguration.class);

		Car c = (Car) context.getBean("myCar");
		int id = c.getId();
		String name = c.getNameCar();

		List<Car> mylist = new ArrayList<Car>();

		mylist = (List<Car>) context.getBean("showCar");

		System.out.println("this is the name car " + id + " " + name);
		System.out.println("this is the name car " + mylist.get(0));
		context.close();
		
	}

}
