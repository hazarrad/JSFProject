package com.springIOC.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springIOC.Entity.Car;

@Configuration
public class Appconfiguration {

	@Bean
	public List<Car> showCar(){
		
		List<Car> listCar=new ArrayList<Car>();
		
		Car c1=new Car(1,"audi");
		Car c2=new Car(1,"BMW");
		Car c3=new Car(1,"Dacia");
			
		listCar.add(c1);
		listCar.add(c2);
		listCar.add(c3);
		
		return listCar;
		
	}
	
	@Bean
	public Car myCar(){
		
		Car c =new Car();
		c.setId(1);
		c.setNameCar("car1");
		
		return c;
		
	}

}
