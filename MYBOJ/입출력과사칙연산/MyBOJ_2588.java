package 입출력과사칙연산;
import java.util.Scanner;

public class MyBOJ_2588 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		
		int C = B % 10; 
		int D = (B / 10) % 10;
		int E = (B / 100) % 10;
		
		System.out.println(A * C);
		System.out.println(A * D);
		System.out.println(A * E);
		System.out.println(A * B);
		
		
	} // main
} // class
