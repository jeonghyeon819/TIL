package BOJ_02_조건문;

import java.util.Scanner;

public class BOJ_2525_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		// 입력받는 시간 값
		int T = scanner.nextInt();
		
		M = M + T;
		
		while (M >= 60) {
			H = H + 1;
			M = M - 60;
		}

		if (H >= 24) {
			H = H - 24;
		}
		
		System.out.print(H + " " + M);
	}
}
