package com.everis.day7.team.generator;

import static com.everis.day7.team.generator.Gender.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Candidate> candidateList = Arrays.asList(new Candidate("JLB | Jihane LAHBOUB", FEMALE),
				new Candidate("MAT | Mohamed ANOUHRAIT", MALE), new Candidate("AHI | Amine HAMDOUCHI", MALE),
				new Candidate("GLI | Ghita LAKHSSASSI", FEMALE), new Candidate("HBA | Hamza BOUARKA", MALE),
				new Candidate("SZN | Sara ZOUMHAN", FEMALE), new Candidate("IBA | Ilyas BOUYA", MALE),
				new Candidate("SRI | Saadeddine RHAZANI", MALE), new Candidate("JHN | Jroundi HASSAN", MALE),
				new Candidate("RBB | Rania BENLACHHAB", FEMALE), new Candidate("NHU | Nada HMAMOU", FEMALE),
				new Candidate("WBI | Wahid BAKHCHATI", MALE), new Candidate("SBR | Souhaila BENOMAR", FEMALE),
				new Candidate("CED | Chaimaa ELHADDAD", FEMALE), new Candidate("OSI | Omar SAFI", MALE),
				new Candidate("AEI | Aimad ELGHAZI", MALE), new Candidate("BEI | Basma ELHACHMI", FEMALE),
				new Candidate("LED | Lamiae ELGUABED", FEMALE), new Candidate("MKI | Mustapha KOJJI", MALE),
				new Candidate("CAH | Chaimae AZOUGAGH", FEMALE), new Candidate("SOH | Sara OULADABDELLAH", FEMALE),
				new Candidate("MEI | Mina ELKHAYATI", FEMALE), new Candidate("AZI | Abderrazak ZAOUIATI", MALE),
				new Candidate("OEI | Oumaima ELHAMMOUTI", FEMALE), new Candidate("HZD | Hassan ZARRAD", MALE),
				new Candidate("LCI | Lamyae CHGUIRI", FEMALE), new Candidate("MAI | Morched AMARTI", MALE),
				new Candidate("YKI | Yahya KADIRI", MALE), new Candidate("KAN | Kamar AHAJTAN", FEMALE),
				new Candidate("NAM | Nouhaila AASOUM", FEMALE), new Candidate("YEI | Youssef ENNAHRI", MALE),
				new Candidate("ANI | Abdelkrim NOURTI", MALE), new Candidate("KAS | Karima AHAIDOUSS", FEMALE),
				new Candidate("HNB | Houda NAKKAB", FEMALE));

		List<Candidate> girlList = new ArrayList<Candidate>();
		List<Candidate> boyList = new ArrayList<Candidate>();

		candidateList.forEach(element -> {
			if (FEMALE.equals(element.getGender())) {
				girlList.add(element);
			} else {
				boyList.add(element);
			}
		});

		List<List<Candidate>> myListOfTeams = TeamGenerator.generateRandomTeam(boyList, girlList, 5);

		System.out.println(myListOfTeams);
	}

}
