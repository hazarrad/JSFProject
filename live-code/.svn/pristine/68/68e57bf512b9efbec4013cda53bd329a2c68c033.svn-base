package com.everis.day6.polymorphism.transformers;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		OrdinateurTransformer ordinateurTransformer = new OrdinateurTransformer();

		Ordinateur ordinateur = new Ordinateur(8, 500, "Dell");
		Ordinateur ordinateur2 = new Ordinateur(16, 1000, "HP");

		OrdinateurDTO dto = (OrdinateurDTO) ordinateurTransformer.toDTO(ordinateur);

		System.out.println(ordinateur);
		System.out.println(dto);

		List<Object> dtoList = ordinateurTransformer.toDTOList(Arrays.asList(ordinateur, ordinateur2));

		for (Object localDto : dtoList) {
			System.out.println(localDto);
		}

	}

}
