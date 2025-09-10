import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 고대유적2_단순반복문 {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("고대유적2.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] map = new int[N][M];

			// input
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			// 길이는 최소 2이상, 1일경우 노이즈처리
			// 1로 표시된 가잔 긴 길이의 유적을 찾기

			// 최대길이를 저장할 변수 선언
			int maxLength = 0;

			// 반복문으로만 탐색해보기
			// 좌우방향 탐색
			for (int i = 0; i < map.length; i++) {

				// 좌우방향(열방향)탐색을 시작하기전에 cnt값을 0으로 초기화
				int cnt = 0;
				for (int j = 0; j < map[i].length; j++) {
					// 현재 위치를 취득하기
					int cur = map[i][j];

					// 현재위치가 유적일경우 시작
					if (cur == 1) {
						cnt++;

						// 길이를 세는 과정에서 최대값의 갱신이 필요할때마다 최대값을 갱신해주기
						if (cnt >= maxLength) {
							maxLength = cnt;
						}

					} // 유적일경우 탐색 처리 끝
					else { // 유적이 아닐경우
						cnt = 0; // 카운트를 0으로 만들어줘야 다음 열에서 유적을 만났을때 1부터 카운트가능
					}
				} // 열방향 진행 반복문
			} // 행방향 진행 반복문

			// 상하방향 탐색
			for (int i = 0; i < map[0].length; i++) {

				// 좌우방향(열방향)탐색을 시작하기전에 cnt값을 0으로 초기화
				int cnt = 0;
				for (int j = 0; j < map.length; j++) {
					// 현재 위치를 취득하기
					int cur = map[j][i];

					// 현재위치가 유적일경우 시작
					if (cur == 1) {
						cnt++;

						// 길이를 세는 과정에서 최대값의 갱신이 필요할때마다 최대값을 갱신해주기
						if (cnt >= maxLength) {
							maxLength = cnt;
						}

					} // 유적일경우 탐색 처리 끝
					else { // 유적이 아닐경우
						cnt = 0; // 카운트를 0으로 만들어줘야 다음 열에서 유적을 만났을때 1부터 카운트가능
					}
				} // 열방향 진행 반복문
			} // 행방향 진행 반복문

			System.out.println("#" + tc + " " + maxLength);

		} // tc반복문
	} // main반복문
} // class닫는부분
