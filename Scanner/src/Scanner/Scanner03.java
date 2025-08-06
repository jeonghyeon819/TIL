//// 주문한 음식의 총 가격을 계산하고 출력하기

package Scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("음식 이름을 입력해주세요:");
		String name = scanner.nextLine();
		
		System.out.print("음식의 가격을 입력해주세요:");
		int price = scanner.nextInt();
		
		System.out.print("음식의 수량을 입력해주세요:");
		int num = scanner.nextInt();
		
		System.out.print(name + " " + num + "개를 주문하셨습니다. 총 가격은 " + (price * num) + "원입니다.");
	} // main
} // class
