package BOJ_03_반복문;

import java.util.Scanner;

public class BOJ_25314 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력받을 수
		int N = scanner.nextInt();
		
		// 몫
		int M = (N / 4);
				
		for (int i = 0; i < M; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");
		
		
	} // main
} // class
