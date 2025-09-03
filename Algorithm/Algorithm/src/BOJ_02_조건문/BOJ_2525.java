package BOJ_02_조건문;

import java.util.Scanner;

public class BOJ_2525 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		// 입력받는 시간 값
		int T = scanner.nextInt();
		
		// 총 더한 값
		int total = M + T;
		
		
		if (total >= 60) {
			H = H+1;
			M = total - 60;
			if (M >= 60) {
				H = H+1;
				M = M-60;
			}
		} else {
			M = total;
		}
		
		if (H >= 24) {
			H = 0;
		}
		
		System.out.print(H + " " + M);
	}
}
