package Method;

public class Method07 {

	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println("changeNumber 호출 전, number: " + num1);
		
		num1 = changeNumber(num1);
		System.out.println("changeNumber 호출 후, number: " + num1);
		
	} // main
	
	
	public static int changeNumber(int num2) {
		
		num2 = num2 * 2;
		return num2;
		
	}
	
} // class
