package IM;

import java.util.Scanner;

public class 고대유적03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		
		for (int t = 1; t <= TC; t++) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			
			int[][] map = new int[N][M];
			
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = scanner.nextInt();
				}
			}
			
			int maxlength = 0;
			
			for (int i = 0; i < map.length; i++) {
				int cnt = 0;
				for (int j = 0; j < map[i].length; i++) {
					int cur = map[i][j];
					
					if (cur == 1) {
						cnt++;
						
						if (cnt >= maxlength) {
							maxlength = cnt;
						}
					}
					
					else {
						cnt = 0;
					}
				}
			}
			
			
			
			
			
			
			
		} // 테스트케이스
		
	} // main

} // class
