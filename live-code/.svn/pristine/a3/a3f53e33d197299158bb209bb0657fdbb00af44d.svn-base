package com.everis.day12.reflexion;

import java.math.BigDecimal;

import com.everis.day11.annotations.FirstAnnotation;

@FirstAnnotation
public class ReflextionDemo {

	private long id;

	public ReflextionDemo() {
	}

	private void myPrivateFunction() {

	}

	public BigDecimal myPublicFunction(String firstParam, int secondParam) {
		myPrivateFunction();
		return null;
	}

	public ReflextionDemo(long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "ReflextionDemo [id=" + id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
