
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		String num = scanner.next();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
	} // main

} // class
