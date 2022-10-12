package com.everis.day7.team.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamGenerator {

//	public static List<Candidate> generateRandomTeam(List<Candidate> candidateList, int teamSize) {
//
//		if (candidateList.size() <= teamSize) {
//			return candidateList;
//		}
//
//		List<Candidate> randomTeam = new ArrayList<>();
//
//		Random random = new Random();
//		for (int i = 0; i < teamSize; i++) {
//			Candidate candidate = candidateList.get(random.nextInt(candidateList.size()));
//			randomTeam.add(candidate);
//		}
//
//		return randomTeam;
//	}

	public static List<List<Candidate>> generateRandomTeam(List<Candidate> boyList, List<Candidate> girlList,
			int teamSize) {

		List<List<Candidate>> randomTeams = new ArrayList<>();

		Random random = new Random();

		boolean girl = girlList.size() > boyList.size() ? true : false;

		int totalSize = girlList.size() + boyList.size();

		for (int i = 0; i < totalSize; i += teamSize) {
			List<Candidate> nextTeam = new ArrayList<>();

			if (girlList.size() + boyList.size() <= teamSize) {
				nextTeam.addAll(girlList);
				nextTeam.addAll(boyList);
				randomTeams.add(nextTeam);
				break;
			}
			for (int j = 0; j < teamSize; j++) {
				if (girl) {
					int indexOfRandomGirl = random.nextInt(girlList.size());
					Candidate candidate = girlList.get(indexOfRandomGirl);
					nextTeam.add(candidate);
					girlList.remove(indexOfRandomGirl);
				} else {
					int indexOfRandomBoy = random.nextInt(boyList.size());
					Candidate candidate = boyList.get(indexOfRandomBoy);
					nextTeam.add(candidate);
					boyList.remove(indexOfRandomBoy);
				}
				girl = !girl;
			}

			randomTeams.add(nextTeam);
			girl = girlList.size() > boyList.size() ? true : false;
		}
		return randomTeams;
	}
}
