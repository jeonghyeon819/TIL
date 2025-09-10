import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class 고대유적2 {
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
			
//			// input check
//			for (int i = 0; i < map.length; i++) {
//				for (int j = 0; j < map[i].length; j++) {
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();
			
			// 길이는 최소 2이상, 1일경우 노이즈처리
			// 1로 표시된 가잔 긴 길이의 유적을 찾기
			
			// 최대길이를 저장할 변수 선언
			int maxLength = 0;
			
			// delta탐색을 이용해보기
			// 탐색할 방향을 지정
			// 우측, 하단 2방향으로 진행
			int[] dr = {0, 1};
			int[] dc = {1, 0};
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					// 현재 위치를 취득하기
					int cur = map[i][j];
					
					// 현재위치가 유적일경우 시작
					if (cur == 1) {
						
						// 델타탐색 시작
						// 다음 인덱스 계산
						// 우측, 하단 순서로 델타 배열을 반복하게됨
						for (int k = 0; k < dc.length; k++) {
							int nr = i + dr[k];
							int nc = j + dc[k];
							
							// 델타의 시작위치가 1로 시작해야 방향을 전환했을때도 1부터 카운트하게됨
							int cnt = 1;
							
							// 다음 인덱스가 유효한 인덱스인지 검사
							if (nr < 0 || nc < 0 || nr >= N || nc >= M || map[nr][nc] != 1) {
								continue; // 다음 델타방향으로 진행하도록 continue
							}
							
							// 인덱스 범위가 유효하며, 다음 값이 1을 가진 유적이라는게 확정됨
							cnt++;
							
							// 델타방향에서 몇칸까지 1이 존재하는지 알수없으므로 반복문을 더 써서 계속 진행
							while (true) {
								// 우측 한칸을 이동한 상태에서, 계속해서 우측방향으로 이동
								// 하단으로 바뀌었을경우 하단 한칸을 이동한 상태에서, 계속 하단으로 이동
								nr = nr + dr[k];
								nc = nc + dc[k];
								
								// while을 빠져나갈 종료조건 -> 맵의 끝에 도달했거나, 1이 아닐경우
								if (nr < 0 || nc < 0 || nr >= N || nc >= M || map[nr][nc] != 1) {
									break; // 1이 연속해서 있지 않을때까지 카운트후 while문을 빠져나가기
								}
								
								// 위의 조건을 통과했다는것은, 범위 내에 있으며 1이 연속되고 있다는뜻이므로 카운트
								cnt++;
							} // while 끝
							// 특정한 방향을 향해서 벽이나 1이 아닌지점을 만날때까지 진행한 상황이됨
							
							// 노이즈처리가 필요
							if (cnt != 1) { // 1일경우에는 그냥 무시해버리기
								maxLength = Math.max(maxLength, cnt); 
							} // if 끝
						}// 델타 반복끝
					} // 유적일경우 탐색 처리 끝
					
					
				} // 열방향 진행 반복문
			} // 행방향 진행 반복문
			
			
			System.out.println("#" + tc + " " + maxLength);
			
		} // tc반복문
	} // main반복문
} // class닫는부분
