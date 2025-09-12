package BOJ_05_문자열;

import java.util.Scanner;

public class BOJ_9086 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		
		for (int t = 1; t <= TC; t++) {
			
			String word = scanner.next();
			
			char first = word.charAt(0);
			char last = word.charAt(word.length() - 1);
			
			System.out.println(first + "" + last);
			
		}
		
	} // main

} // class
