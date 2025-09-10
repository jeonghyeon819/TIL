import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 색칠하기3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("색칠하기3.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 값을 입력받기
			// 빨간색 도형에 대한 입력
			int redStartRow = sc.nextInt();
			int redStartColumn = sc.nextInt();

			int redEndRow = sc.nextInt();
			int redEndColumn = sc.nextInt();

			// 파란색 도형에 대한 입력
			int blueStartRow = sc.nextInt();
			int blueStartColumn = sc.nextInt();

			int blueEndRow = sc.nextInt();
			int blueEndColumn = sc.nextInt();

			// 일단 색칠해보기
			// 어디서부터 어디까지 색칠할지 지정이 필요
			// 1. 주어진값의 큰 값을 찾아서 그 크기만큼 배열선언
			// 2. 사실 이 문제는 10*10이므로 10*10 배열을 하나 선언해도됨

			int maxRow = redEndRow > blueEndRow ? redEndRow : blueEndRow;
			int maxColumn = redEndColumn > blueEndColumn ? redEndColumn : blueEndColumn;
			
			
			
			// 값을 탐색할 배열을 선언
			// 인덱스를 숫자로 사용할것이므로 +1을 해주기
			int[][] map = new int[maxRow + 1][maxColumn + 1];

			// 색칠하기를 시작
			// 빨간색 영역에 대한 색칠하기
			for (int i = redStartRow; i <= redEndRow; i++) {
				for (int j = redStartColumn; j <= redEndColumn; j++) {
					map[i][j]++;
				}
			}

			// 파란색 영역에 대한 색칠하기
			for (int i = blueStartRow; i <= blueEndRow; i++) {
				for (int j = blueStartColumn; j <= blueEndColumn; j++) {
					map[i][j]++;
				}
			}

			// 겹친영역은 2로 카운트 됬을것이므로 2에대한 카운트를 시작하기
			int col = 0; // 가로
			int row = 0; // 세로

			// 맵 내부의 어느부분을 겹치는지 알수없으므로 전체순회
			// 가로카운트
			for (int i = 0; i < map.length; i++) {

				if (col != 0) {
					continue;
				}

				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 2) { // 겹친부분
						col++;
					}
				}
			}

			// 세로카운트
			for (int i = 0; i < map[0].length; i++) {

				if (row != 0) {
					continue;
				}

				for (int j = 0; j < map.length; j++) {
					if (map[j][i] == 2) { // 겹친부분
						row++;
					}
				}
			}

			System.out.println("#" + tc + " " + col + " " + row);
		}
	}

}
