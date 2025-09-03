package IM;

import java.util.Scanner;

public class 고대유적01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int TC = scanner.nextInt();
		
		for (int t = 1; t <= TC; t++) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			
			int[][] map = new int[N][M];
			
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					// 여기 아래 틀림
					map[i][j] = scanner.nextInt();
				}
			}
					
			int maxlength = 0;
					
					
				for (int i = 0; i < map.length; i++) {
					int cnt = 0;
					for (int j = 0; j < map[i].length; j++) {
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
					
					
					for (int i = 0; i < map[0].length; i++) {
						int cnt = 0;
						for(int j = 0; j < map.length; j++) {
							int cur = map[j][i];
							
							if (cur == 1) {
								cnt++;
								if(cnt >= maxlength) {
									maxlength = cnt;
								}
							}
							
							else {
								cnt = 0;
							}
						}
					}
					
					System.out.println("#" + t + " " + maxlength);

			
		} // 테스트케이스
		
	} // main

} // class
