package BOJ_03_반복문;

import java.util.Scanner;

public class BOJ_11022 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		
		for (int t = 1; t <= TC; t++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println("Case #" + t + ": " + A + " + " + B + " = " + (A+B));
		}
		
	}

}
