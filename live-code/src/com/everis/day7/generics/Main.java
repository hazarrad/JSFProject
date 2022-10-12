package com.everis.day7.generics;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		OrdinateurGenericDAO genericDAO = new OrdinateurGenericDAOImpl();
//
//		OrdinateurDTO dto = genericDAO.create(new OrdinateurDTO(4, 555, "Dell"));
//		System.out.println(dto);
//
//		EmployeeGenericDAO employeeGenericDAO = new EmployeeGenericDAOImpl();
//
//		Employee employee = employeeGenericDAO.create(new Employee());
//
//		System.out.println(employee);
//		
//		List
//		Set
//		Map
		List list = Arrays.asList("JLB | Jihane LAHBOUB", "MAT | Mohamed ANOUHRAIT", "AHI | Amine HAMDOUCHI",
				"GLI | Ghita LAKHSSASSI", "HBA | Hamza BOUARKA", "SZN | Sara ZOUMHAN", "IBA | Ilyas BOUYA",
				"SRI | Saadeddine RHAZANI", "JHN | Jroundi HASSAN", "RBB | Rania BENLACHHAB", "NHU | Nada HMAMOU",
				"WBI | Wahid BAKHCHATI", "SBR | Souhaila BENOMAR", "CED | Chaimaa ELHADDAD", "OSI | Omar SAFI",
				"AEI | Aimad ELGHAZI", "BEI | Basma ELHACHMI", "LED | Lamiae ELGUABED", "MKI | Mustapha KOJJI",
				"CAH | Chaimae AZOUGAGH", "SOH | Sara OULADABDELLAH", "MEI | Mina ELKHAYATI",
				"AZI | Abderrazak ZAOUIATI", "OEI | Oumaima ELHAMMOUTI", "HZD | Hassan ZARRAD", "LCI | Lamyae CHGUIRI",
				"MAI | Morched AMARTI", "YKI | Yahya KADIRI", "KAN | Kamar AHAJTAN", "NAM | Nouhaila AASOUM",
				"YEI | Youssef ENNAHRI", "ANI | Abdelkrim NOURTI", "KAS | Karima AHAIDOUSS", "HNB | Houda NAKKAB");
		
		list.forEach(System.out::println);
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Math.random());
//		}

	}
}
