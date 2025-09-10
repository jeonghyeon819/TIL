import java.util.Arrays;
import java.util.Scanner;

public class 점점커지는당근개수 {

	public static void main(String[] args) {
		String str = "4\r\n"
				+ "5\r\n"
				+ "1 2 3 4 5\r\n"
				+ "5\r\n"
				+ "4 5 1 2 3\r\n"
				+ "5\r\n"
				+ "5 4 3 2 1\r\n"
				+ "8\r\n"
				+ "1 2 1 2 3 1 2 1";
		
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(str);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int result = 0;
			
			// N을 입력받기
			int N = sc.nextInt();
			
			// N : ( 당근개수 )의 크기만큼 배열을 선언
			int[] arr = new int[N];
			
			// N개만큼 당근을 입력받는 부분
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			// 입력 확인
//			System.out.println(Arrays.toString(arr));
			
			// 당근이 점점 증가하는지 확인하는구문
			// 전체 당근 배열을 돌면서 확인
			// 가장 증가하는 길이가 긴 구간을 카운트하기
			
			// 현재값을 1로 카운트 한 상태에서 다음값과 비교하기
			int cnt = 1;
			int maxCnt = 0;
			
			// 전체 배열 순회
			for (int i = 0; i < arr.length -1; i++) { // 0~4<5 -> 0~3까지 4번밖에 돌지않음
//				System.out.println(arr[i]);
				
				// 증가하는 부분에 대한 로직 작성
				// 현재값보다 다음값이 더 크다
				if (arr[i] < arr[i+1]) { // 0~3까지 비교 +1 4 -> arr[3] < arr[4] 이 비교가 마지막이됨
					// 카운트하기
					// 현재값을 1로보고, 다음값이 더 클경우 길이를 2로 변경
					// 이것을 반복하여 가장 긴 길이를 찾아주기
					cnt++;
				} else { // 다음값이 더 커지지 않을경우에 대한 로직 작성
					maxCnt = Math.max(maxCnt, cnt);
//					if (maxCnt < cnt) {
//						maxCnt = cnt;
//					}
					// 지금까지 세어오던 카운트를 1로 초기화
					cnt = 1;
				}
			} // 당근 배열 전체 순회 끝
			
			
			// else구문에 빠지지 않았더라도 최종적으로 모든 값에 대해서 가장 긴 값이 있을경우 반영
			maxCnt = Math.max(maxCnt, cnt);
			
			System.out.println("#" + tc + " " + maxCnt);
		}
		
		
	}

}
