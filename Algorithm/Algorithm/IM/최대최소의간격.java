package IM;

import java.util.Scanner;

public class 최대최소의간격 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			int minvalue = Integer.MAX_VALUE;
			int maxvalue = Integer.MIN_VALUE;
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				
				if (arr[i] < minvalue) {
					minvalue = arr[i];
				}
				
				if (arr[i] > maxvalue) {
					maxvalue = arr[i];
				}
			}
			
			int minIdx = 0;
			int maxIdx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				int cur = arr[i];
				
				if (cur == minvalue) {
					minIdx = i;
					break;
				}
			}
			
			for (int i = arr.length-1; i >= 0; i--) {
				int cur = arr[i];
				
				if (cur == maxvalue) {
					maxIdx = i;
					break;
				}
			}
			
			System.out.println("#" + t + " " + Math.abs(maxIdx - minIdx));
			
		}
		
	}

}
