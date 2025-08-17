package Method;

import java.util.Scanner;

public class Methodex4 {

	public static void main(String[] args) {
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			System.out.println("------------------------------------");
			
			System.out.print("선택: ");
			
			int choice = scanner.nextInt();
			int amount;
			
			switch (choice) {
				case 1:
				case 2:
				case 3:
					System.out.println("현재 잔액: " + balance + "원");
					break;
				case 4:
					System.out.println("시스템을 종료합니다.");
					return;
				default:
					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			}
		}
		
	} // main
	
	
	
	
} // class
