package BOJ_03_반복문;

import java.util.Scanner;

public class BOJ_25304 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		
		int N = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			sum += (a * b);
		}
		
		if (sum == X) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		
	}
	
}
