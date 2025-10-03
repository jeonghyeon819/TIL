import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] map = new int[N+1][N+1];
			int result = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < N+1; i++) {
				int count = 0;
				for (int j = 0; j < N+1; j++) {
					if (map[i][j] == 1) {
						count++;
					} else {
						if (count == K) {
							result++;
						}
						count = 0;
					}
				}
			}
			
			for (int i = 0; i < N+1; i++) {
				int count = 0;
				for (int j = 0; j < N+1; j++) {
					if (map[j][i] ==1) {
						count++;
					} else {
						if (count == K) {
							result++;
						}
						count = 0;
					}
				}
			}
			
			System.out.println("#" + t + " " + result);
		}
	}
}
