package BOJ_02_조건문;

import java.util.Scanner;

public class BOJ_2884 {
	public static void main(String[] args) {
		
		// 45분 일찍 알림 설정하기
		// 첫째 줄에 두 정수 H와 M이 주어진다.
		
		Scanner scanner = new Scanner(System.in);
		
		// 주어진 시간, 분
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M < 45) {
			H = (H-1);
			M = ((M+60) - 45);
		} else {
			M = M - 45;
		}
		
		if (H < 0) {
			H = 23;
		}
		
		System.out.print(H + " " + M);
	}
}
