// 구구단 출력

package Scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단의 단 수를 입력해주세요:");
		int n = scanner.nextInt();
		
		System.out.println(n + "단의 구구단: ");
		for (int i = 1; i < 10; i++) {			
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	} // main
} // class
