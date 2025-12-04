import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		
		String revstr1 = "";
		for (int i = str1.length() -1; i >= 0; i--) {
//			System.out.print(str1.charAt(i));
			revstr1 += str1.charAt(i);
		}
		
		String revstr2 = "";
		for (int j = str2.length() -1; j >= 0; j--) {
//			System.out.print(str2.charAt(j));
			revstr2 += str2.charAt(j);
		}
		
		int rev1 = Integer.parseInt(revstr1);
		int rev2 = Integer.parseInt(revstr2);
		
		if (rev1 > rev2) {
			System.out.println(rev1);
		} else {
			System.out.println(rev2);
		}
	}
}
