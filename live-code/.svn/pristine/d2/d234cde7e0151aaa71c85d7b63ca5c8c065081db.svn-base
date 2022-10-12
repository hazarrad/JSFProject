package com.everis.day6.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Movable fly = new Fly();
		Movable walk = new Walk();
		
		List<Movable> movableList = new ArrayList<Movable>();
		movableList.add(fly);
		movableList.add(walk);
		
		for(Movable movable : movableList) {
			movable.move(44, 88);
		}
//
//		fly.move(25, 99);
//		walk.move(33, 333);
	}
}
