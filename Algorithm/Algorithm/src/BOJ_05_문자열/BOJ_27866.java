package BOJ_05_문자열;

import java.util.Scanner;

public class BOJ_27866 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		int num = scanner.nextInt();
		
		System.out.print(word.charAt(num - 1));
		
		
	} // main

} // class
