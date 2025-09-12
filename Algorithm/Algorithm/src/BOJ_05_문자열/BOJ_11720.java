package BOJ_05_문자열;

import java.util.Scanner;

public class BOJ_11720 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String num = scanner.next();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
	} // main

} // class
