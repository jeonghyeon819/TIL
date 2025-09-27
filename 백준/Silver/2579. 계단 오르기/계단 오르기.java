
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 계단의 수
		int N = sc.nextInt();
		
		// 계단에 있는 점수가 있는 배열 만들기
		int[] score = new int[N];
		
		// 배열 안에 값을 넣기
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}
		
		// 계단이 1개밖에 없으면 그 계산의 점수가 최대 점수이니까 바로 출력하고 종료
		if (N == 1) {
			System.out.println(score[0]);
			return;
		}
		
		// 각 계단까지 도달했을 떄의 최대 점수를 저장할 배열 만들기
		int[] dp = new int[N];
		
		// 첫번째 계단까지 오를 수 있는 최대 점수는 첫 번째 계단 점수 자체
		dp[0] = score[0];
		// 두번째 계단은 1번을 거쳐야 하니까 더한다.
		dp[1] = score[0] + score[1];
		
		// 세번째는 경로가 2가지이니까, max로 두 값 중 큰 값을 선택한다.
		if (N > 2) {
			dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);
		}
		
		// 4번째부터 마지막까지 반복하면서 최대 점수를 계산한다.
		// 이 조건으로 한 계단 연속으로 3번 오를 수 없음을 만족하고 최대 점수를 구할 수 있다.
		for (int i = 3; i < N; i++) {
			dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
		}
		
		// 마지막 계단까지 올랐을 때의 최대 점수를 출력한다.
		System.out.println(dp[N-1]);
	}
}
