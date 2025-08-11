package SWEA.max2068;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class max01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("./src/SWEA/max2068/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 개수를 입력받는다.
		int TC = sc.nextInt();
		
		// TC 만큼 반복
		// 각 테스트 케이스마다 반복
		// t는 현재 몇 번째 케이스인지 나타내준다.
		for (int t = 1; t <= TC; t++) {
			int max = 0; // 최대값을 저장할 변수 선언, 0으로 초기화
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt(); // 한 줄씩 정수를 읽어와서 num 변수에 저장한다.
				if(num > max) {
					max = num;
					}
				}
			System.out.println("#"+ t + " " + max);
		}
		sc.close();
	} //main
} //class
