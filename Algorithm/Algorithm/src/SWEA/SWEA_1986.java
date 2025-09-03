package SWEA;

import java.util.Scanner;

public class SWEA_1986 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 테스트 케이스
		int TC = scanner.nextInt();
		
		for(int t = 1; t <= TC; t++) {

			// N만큼 값을 받겠다.
			int N = scanner.nextInt();
			
			// 합계 초기화
			int sum = 0;
					
			// N의 크기만큼 반복하겠다.
			for(int i = 1; i <= N; i ++) {
				if(i % 2 == 0) {
					sum -= i;
				} else {
					sum += i;
				}
			}
		
			System.out.println("#" + t + " " + sum);
		}
		
		
	}

}
