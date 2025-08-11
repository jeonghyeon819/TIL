package avg2071;
//SWEA 2071 평균값 구하기
//10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.
//(소수점 첫째 자리에서 반올림한 정수를 출력한다.)
//가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
//출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("./src/avg2071/input.txt");
		Scanner scanner = new Scanner(file);
//		Scanner scanner = new Scanner(System.in);
		
		// TC에 int 값을 가져온다.
				int TC = scanner.nextInt();
				
				for (int t = 1; t <= TC; t++) {
					int sum = 0;
					
					for (int i = 0; i < 10; i++) {
						int num = scanner.nextInt();
						sum += num;
					}

					int avg = (sum+5)/10;
					
					System.out.println("#" + t + " " + avg);
				
				}
		scanner.close();
	} // main
} // class