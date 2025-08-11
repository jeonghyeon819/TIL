package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exam1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SWEA/odd2072/input.txt");
		Scanner sc = new Scanner(file); 
//		Scanner sc = new Scanner(System.in); 
		
		// 테스트 케이스 개수를 입력받는다.
		int TC = sc.nextInt();
		
		// 각 TC만큼 반복하고
		// t는 현재 몇 번째 케이스인지 나타내준다.
		for (int t = 1; t<=TC; t++) {
			int sum = 0; // 홀수 합을 저장할 변수
			
			// 10개의 정수를 입력받는다.
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if (num % 2 != 0) {
					sum += num;
				}
			}
			// 결과 출력
			System.out.println("#" + t + " " + sum);
		}
	} // main

} // class
