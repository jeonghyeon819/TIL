package BOJ_03_반복문;

import java.util.Scanner;

public class BOJ_8393 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= N; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
