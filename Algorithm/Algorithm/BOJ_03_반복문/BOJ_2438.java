package BOJ_03_반복문;

import java.util.Scanner;

public class BOJ_2438 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int star = scanner.nextInt();
		
		// 세로 줄
		for (int i = 1; i <= star; i++) {
			// 가로 줄
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
