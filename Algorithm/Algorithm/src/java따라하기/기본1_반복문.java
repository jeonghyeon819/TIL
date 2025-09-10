package java따라하기;

import java.util.Scanner;

public class 기본1_반복문 {
	
	public static void main(String[] args) {
		
		// for (초기화; 조건식; 증감식) { 반복 내용 }
		// 조건식을 비워두면 항상 참으로 인식해서 끝나지 않는다.
		// 반복 횟수를 알고 있을 때 사용하면 좋다.
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		
		// 구구단
//		Scanner scanner = new Scanner(System.in);
//		
//		int num = scanner.nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(num + " * "+ i + " = " + (num * i));
//		}
		
		
		// while(조건식) { 반복 내용 }
		// 조건식 생략 불가능
		
		
		// do { 실행 문장 }
		// while (조건식);
		// do while문은 무조건 한번은 수행하고 조건식을 판별하므로 1번은 실행한다.
		
		
		// break : 가까이에 있는 반복문을 종료
		// continue : 남아있는 구문을 수행하지 않고 다음 반복으로 이동
		
		// 짝수 단만 출력하겠다.
//		for (int i = 2; i <= 9; i++) {
//			if (i % 2 == 1)
//				continue;
//			System.out.println(i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//		}
		
		// 5단까지 출력하겠다.
//		for (int i = 2; i <= 9; i++) {
//			if (i > 5)
//				break;
//			System.out.println(i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//		}
		
		// 각 단의 5번째 줄까지 출력하겠다.
//      for (int i = 2; i <= 9; i++) {
//          System.out.println(i + "단");
//          for (int j = 1; j <= 9; j++) {
//              if (j > 5)
//                  break;
//              System.out.printf("%d * %d = %d\n", i, j, i * j);
//          }
//      }
//
//      // 2단의 5번째 줄까지 출력하고 멈춘다.
//      out: for (int i = 2; i <= 9; i++) {
//          System.out.println(i + "단");
//          for (int j = 1; j <= 9; j++) {
//              if (j > 5)
//                  break out;
//              System.out.printf("%d * %d = %d\n", i, j, i * j);
//          }
//      }
//      
//      // 2단의 5번째 줄까지 출력하고 멈춘다.
//      out: for (int i = 2; i <= 9; i++) {
//          System.out.println(i + "단");
//          for (int j = 1; j <= 9; j++) {
//              if (j > 5)
//                 continue out;
//              System.out.printf("%d * %d = %d\n", i, j, i * j);
//          }
//      }
		
	} // main

} // class
