package java따라하기;

import java.util.Scanner;

public class 기본1_조건문 {
	
	public static void main(String[] args) {
		
		// if (조건식) { };
		// -> 조건식이 참일 경우 실행
		
		// 조건식에는 boolean 형태의 값을 반환하는 식이나, boolean 값이 들어간다.
		// 만약 수행할 문장이 하나라면 중괄호는 생략이 가능하다.
		
		// if (조건식) { };
		// else{ }
		// -> if가 참이면 if 실행, 아니면 else 실행
		
		// else if
		
		// switch
		
		boolean isok = true;
		
		if (isok) {
			System.out.println("할 수 있다.");
		} else {
			System.out.println("할 수 없다.");
		}
		
		
		// 계절
		// switch
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int month = scanner.nextInt();
		
		switch (month) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
			
		case 6, 7, 8:
			System.out.println("여름");
			break;
			
		case 9, 10, 11:
			System.out.println("가을");
			break;
			
		case 12, 1, 2:
			System.out.println("겨울");
		default:
			System.out.println("잘못된 달 입력입니다.");
			break;
		}
		
	}

}
