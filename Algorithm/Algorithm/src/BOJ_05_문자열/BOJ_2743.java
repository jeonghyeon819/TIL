package BOJ_05_문자열;

import java.util.Scanner;

public class BOJ_2743 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			count++;
		}
		
		System.out.println(count);
		
	} // main

} // class
