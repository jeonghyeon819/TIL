import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int star = scanner.nextInt();
		
		// 세로
		for (int i = 1; i <= star; i++) {
			
			// 공백
			for (int j = 0; j < star-i; j++) {
				System.out.print(" ");
			}
			
			// 가로
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
				
			System.out.println();
				
						
		}
		
	} // main
} // class
