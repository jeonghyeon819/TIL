import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] busStop = new int[5001];
			
			for (int i = 0; i < N; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				for (int j = A; j <= B; j++) {
					busStop[j]++;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t);
			int P = sc.nextInt();
			for (int i = 0; i < P; i++) {
				int tmp = sc.nextInt();
				sb.append(" " + busStop[tmp]);
			}
			System.out.println(sb.toString());
		}
	}
}
