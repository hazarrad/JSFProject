package exercice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class densty {

	public static String text;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your text");
		 text = sc.nextLine();

		//double tkn = countWordsUsingSplit(text);
		//int NKR = countwords(text);

		//System.out.println(tkn);

		//double operation =  (2/tkn)* 100;


		 countwords(text);
	}

	public static int countWordsUsingSplit(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		return getnumber(input);
	}

	
	public static int getnumber(String repeat) {
		String[] words = repeat.split("\\s+");
		return words.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static int countwords(String inputString) {

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

			int NKR=entry.getValue();
			String getkey=entry.getKey();
			double tkn = countWordsUsingSplit(text);
			
			String operation = String.format("%.2f",(NKR/tkn)* 100);



			String show = getkey + " : " +"is "+ operation;

			System.out.println(" densty : "+show +"%");


		}
		return getnumber(inputString);

	}

}
