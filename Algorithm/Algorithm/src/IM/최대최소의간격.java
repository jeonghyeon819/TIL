import java.util.Arrays;
import java.util.Scanner;

public class 최대최소의간격 {

	public static void main(String[] args) {
		String str = "3\r\n"
				+ "5\r\n"
				+ "1 1 2 3 3\r\n"
				+ "10\r\n"
				+ "3 10 5 5 8 3 9 1 3 3 \r\n"
				+ "20\r\n"
				+ "4 1 6 7 9 4 1 4 8 4 1 6 5 3 1 4 3 1 10 10 ";
		
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(str);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			// 최대값과 최소값을 찾아라
			int minValue = Integer.MAX_VALUE;
			int maxValue = Integer.MIN_VALUE;
			
			// 최대,최소값을 찾는 부분
			// 최대 최소값의 범위에 해당하는 값을 받아주기
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				
				// 현재값이 지금까지 찾아오던 minValue보다 작다면, minValue를 현재값으로 갱신
				if (arr[i] < minValue) {
					minValue = arr[i];
				}
				
				// 현재값이 지금까지 찾아오던 maxValue보다 크다면, maxValue를 현재값으로 갱신
				if (arr[i] > maxValue) {
					maxValue = arr[i];
				}
			}
			
			// 입력값 체크
//			System.out.println(Arrays.toString(arr));
			
			int minIdx = 0;
			int maxIdx = 0;
			
			// 위치값을 찾는 부분
			// 최대값과 최소값에 해당하는 위치를 찾아보기
			for (int i = 0; i < arr.length; i++) {
				int cur = arr[i];
				
				if (cur == minValue) {
					// 최소값에 해당하는 위치 index를 어딘가에 저장하기
					minIdx = i;
					// 최소값이 등장할경우, 최소값은 가장 처음 등장한 값이 가장 작은값으로 취급
					break; // break를 통해서 가장작은값이 최초 1회 등장하면 더이상 진행하지 않도록 중지
				}
			}
			
			
			// 최대값에 해당하는 위치를 찾기
//			for (int i = 0; i < arr.length; i++) {
//				int cur = arr[i];
//				
//				if (cur == maxValue) {
//					// 최소값에 해당하는 위치 index를 어딘가에 저장하기
//					maxIdx = i;
//					
//					// break문을 없애서 마지막까지 반복도 가능
////					// 최소값이 등장할경우, 최소값은 가장 처음 등장한 값이 가장 작은값으로 취급
////					break; // break를 통해서 가장작은값이 최초 1회 등장하면 더이상 진행하지 않도록 중지
//				}
//			}
			// 뒤에서 부터 탐색하기
			for (int i = arr.length-1; i >= 0; i--) {
				int cur = arr[i];
				
				//뒤에서부터 탐색하다가 가장 큰값이 나타났을경우
				if (cur == maxValue) {
					// 최소값에 해당하는 위치 index를 어딘가에 저장하기
					maxIdx = i;
					
					// break문을 없애서 마지막까지 반복도 가능
					// 최대값이 등장할경우, 최대값은 가장 마지막에 등장한 값이 가장 큰값으로 취급
					break; // break를 통해서 가장작은값이 최초 1회 등장하면 더이상 진행하지 않도록 중지
				}
			}
			
//			int cnt = 0;
//			for (int i = minIdx; i < maxIdx; i++) {
//				cnt++;
//			}
			
			System.out.println("#" + tc + " " + Math.abs(maxIdx - minIdx));
			
		} //tc
	} // main

} // class
