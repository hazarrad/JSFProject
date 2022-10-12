package com.everis.day10.exceptions;

import java.io.FileNotFoundException;

public class Main {

	public Main() throws Exception {
		int entier = 0;
		int diviseur = 1;
		try {
			entier = 5;
			diviseur = 0;

			System.out.println("before exception");
			int resultat = entier / diviseur;
			System.out.println("after exception");
			System.out.println(resultat);
		} catch (ArithmeticException | NullPointerException e) {
//			e.printStackTrace(); // ne jamais l'utiliser en prod
			System.out.println("division par 0 " + e.getMessage());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("after catch");
		System.out.println(entier);
		System.out.println(diviseur);

		functionThrows();

	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void functionThrows() throws Exception {
		if (true) {
			throw new Exception("le message de l'exception de la fonction functionThrows");
		} else {
			System.out.println("le traitement");
			System.out.println("de ma");
			System.out.println("fonction");
		}
	}

}
