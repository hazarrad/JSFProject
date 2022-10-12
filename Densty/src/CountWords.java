package exercice;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string : ");
		String word=sc.nextLine();
		
		System.out.println("the count of words is : " +countword(word));

	}
	
	
	public static int countword(String word) {
		if (word == null || word.isEmpty()) {
			return 0;
		}
		String[] words = word.split("\\s+");
		return words.length;
	}

}
