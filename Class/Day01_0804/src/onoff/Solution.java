// 스위치 온 오프
// N개의 스위치가 있다.
// 스위치는 0 : off / 1 : on 의 상태이고 초기의 스위치는 모두 off인 상태이다.
// 사용자로부터 M개의 입력을 받아 해당 입력 값의 배수의 자리의 스위치를 on 상태였다면 off로 off였다면 on으로 바꾼다.
// 모든 입력이 끝난 후 스위치의 상태를 출력하라.

package onoff;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		// Scanner를 사용해서 값을 받겠다.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 전체 스위치 수
		int m = sc.nextInt(); // 입력받을 수
		
		// 모든 스위치 초기 상태
		int[] arr = new int[n]; // n만큼 스위치 배열을 만들겠다.
		
		// 전체 스위치 만큼 반복
		for (int t = 1; t < m; t++) {
			// num 값에 넣겠다.
			int num = sc.nextInt();
			
			// for문을 통해 n까지 반복하겠다.
			for (int i = 0; i < n; i++) {
				// 만약 1이면 0으로 0이면 1로 바꾸겠다.
				arr[i] % m == 0 ? 1 : 0;
				}
			System.out.println(arr);
		}
	} // main
} // class
