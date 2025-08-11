package avg2071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class avg2071 {
	
//	10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.
//	(소수점 첫째 자리에서 반올림한 정수를 출력한다.)
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File ("./src/SWEA/avg2071/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		for (int t = 1; t <= TC; t++) {
			int sum = 0;
			
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if ()
			}
		}	
	}
}
