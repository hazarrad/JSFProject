package exercice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your text : ");
		String input = scanner.nextLine();

		int NKR=countwords(input);
		
		System.out.println(NKR);

		

		

	}
	
	public static int countwords(String inputString){
		
		int count;
		String[] wordsArray = inputString.split("\\s+");
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : wordsArray) {
			if (map.containsKey(word)) {
				count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			
			
			String show =entry.getKey() + " : " + entry.getValue();
					
					System.out.println(show);
			
			

		}
		return getnumber(inputString);

	}
	
	
	public static int getnumber(String repeat){
		String[] words = repeat.split("\\s+");
		return words.length;
	}
}