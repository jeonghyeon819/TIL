package BOJ_심화;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3003_02 {
	
	public static void main(String[] args) {
		
		// 체스는 총 16개의 피스를 사용하고, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성이 되어있다.
		// 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는 지
		
		Scanner scanner = new Scanner(System.in);
		
		int[] original = {1, 1, 2, 2, 2, 8};
		
		// 6개의 배열을 만든다.
		int[] arr = new int[6];
		
		// arr[i]번째에 값을 넣겠다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// i = 0 부터 6까지 반복하면서 값을 비교하겠다.
		for (int i = 0; i < arr.length; i++) {

			System.out.print(original[i] - arr[i] + " ");
					
		}
		
		
	} // main

} // class
