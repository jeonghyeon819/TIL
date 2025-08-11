package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exam2 { // 짝수만 더해서 출력해보기
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("./src/SWEA/odd2072/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		
		int TC = sc.nextInt();
		for (int t = 1; t <= TC; t++) {
			int sum = 0; // 합을 받을 변수
		
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				sum += num;
				}
			}
		System.out.println("#" + t + " " + sum);	
		}
	} // main
} // class
