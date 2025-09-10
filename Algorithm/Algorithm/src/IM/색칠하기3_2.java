import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 색칠하기3_2 {

	public static void main(String[] args) throws FileNotFoundException {
//		System.setIn(new FileInputStream("색칠하기3.txt"));
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

			// 겹치는 부분 -> 교집합 부분을 찾아주기
			// red시작점이 blue시작지점보다 클 경우 -> red가 blue안에 포함된다.
			int overlapRowStart = redStartRow > blueStartRow ? redStartRow : blueStartRow;
			// red끝지점이 blue끝지점보다 클 경우 -> blue가 red안에 포함된다.
			int overlapRowEnd = redEndRow > blueEndRow ? blueEndRow : redEndRow;

			// red시작지점이 blue 시작지점보다 클 경우 -> red가 blue안에 포함된다.
			int overlapColStart = redStartColumn > blueStartColumn ? redStartColumn : blueStartColumn;
			// red끝지점이 blue 끝지점보다 클 경우 -> blue가 red안에 포함된다
			int overlapColEnd = redEndColumn > blueEndColumn ? blueEndColumn : redEndColumn;

			// 겹치는 부분에 대해서 서로 빼기연산을 통해 길이를 구하기
			int row = overlapRowEnd - overlapRowStart + 1;
			int col = overlapColEnd - overlapColStart + 1;

			// 만약 겹치는 영역이 없을경우에 대한 처리
			if (row <= 0 || col <= 0) {
				row = 0;
				col = 0;
			}

			System.out.println("#" + tc + " " + col + " " + row);
		}
	}

}
