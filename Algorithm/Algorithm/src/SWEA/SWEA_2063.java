package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 첫 줄에 주어지는 N
		int N = scanner.nextInt();
	
		// N개의 점수가 주어지는 값을 배열로 만든다.
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			// N의 크기만큼 값을 받겠다.
			arr[i] = scanner.nextInt();
		}
		
		// 배열을 정리하겠다.
		Arrays.sort(arr);
		
		// 중앙값을 찾겠다.
		int mid = arr[N / 2];
		
		System.out.println(mid);
		
		}
}
