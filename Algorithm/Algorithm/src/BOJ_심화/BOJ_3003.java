package BOJ_심화;

import java.util.Scanner;

public class BOJ_3003 {
	
	public static void main(String[] args) {
		
		// 체스는 총 16개의 피스를 사용하고, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성이 되어있다.
		// 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는 지
		
		Scanner scanner = new Scanner(System.in);
		
		// 킹 & 퀸
		int num1 = 1;
		
		// 룩 & 비숍 & 나이트
		int num2 = 2;
		
		// 폰
		int num3 = 8;
		
		int k = scanner.nextInt();
		int q = scanner.nextInt();
		int l = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		
		// k랑 q가 num1과 같으면 그냥 출력
		// num1 보다 크면 num1 - k&q
		// num1 보다 작으면 (0) + 1
		if (k == num1) {
			k = 0;
		} else if (k > num1) {
			k = num1 - k;
		} else {
			k = 1;
		}

		if (q == num1) {
			q = 0;
		} else if (q > num1) {
			q = num1 - q;
		} else {
			q = 1;
		}
		
		if (l == num2) {
			l = 0;
		} else if (l > num2) {
				l = num2 - l;
		} else {
				l = num2 - l;
		}
		
		if (b == num2) {
			b = 0;
		} else if (b > num2) {
			b = num2 - b;
		} else {
			b = num2 - b;
		}
		
		if (n == num2) {
			n = 0;
		} else if (n > num2) {
			n = num2 - n;
		} else {
			n = num2 - n;
		}
		
		if (p == num3) {
			p = 0;
		} else if (p > num3) {
			p = num3 - p;
		} else {
			p = num3 - p;
		}
		
		System.out.print(k + " " + q + " " + l + " " + b + " " + n + " " + p);
		
	} // main

} // class
