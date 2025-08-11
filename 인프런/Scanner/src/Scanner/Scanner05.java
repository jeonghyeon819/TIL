package Scanner;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
			String name = scanner.next();
			
			if (name.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("나이를 입력하세요: ");
			int age = scanner.nextInt();
//			scanner.nextLine(); // 우리 눈에는 안보이는 \n을 빼버리겠다! 라는 의미
			
			System.out.println("입력한 이름: " + name + ", 나이: " + age);
		}
	}
}
