
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스
		int TC = sc.nextInt();
		
		for (int t = 1; t <= TC; t++) {
		
			// 각 문자 R번 반복
			int R = sc.nextInt();

			// 문자열 S
			String S = sc.next();
			
			// 새 문자열 P
			String P = "";

			for (int i = 0; i < S.length(); i++) {
				char word = S.charAt(i);
				
				for (int j = 0; j < R; j++) {
					P += word;
				}
			}
			System.out.println(P);
		}
		
	} // main

} // class
