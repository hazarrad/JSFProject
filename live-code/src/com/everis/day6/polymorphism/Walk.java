package com.everis.day6.polymorphism;

public class Walk implements Movable {

	@Override
	public void move(int x, int y) {
		System.out.println("You must walk from " + x + " to " + y);
	}

}
