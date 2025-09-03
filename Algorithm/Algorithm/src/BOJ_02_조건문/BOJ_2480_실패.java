package BOJ_02_조건문;

import java.util.Scanner;

public class BOJ_2480_실패 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int price;
		if (a == b && b == c) {
			price = 10000 + a * 1000;
		}
		
		else if (a == b || a == c) {
			price = 1000 + a * 100;
		}
		
		else if (b == c) {
			price = 1000 + b * 100;
		}
		
		else {
			int max = Math.max(a, Math.max(b, c));
			price = max * 100;
		}
		
		System.out.println(price);
		
		
	} // main

} // class
