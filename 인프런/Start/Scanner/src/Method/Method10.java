package Method;

public class Method10 {

	public static void main(String[] args) {
		System.out.println("1: " + add(1, 2));
		System.out.println("2: " + add(1, 2, 3));
		
		
	} // main
	
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("1번 호출");
		return a + b + c;
	}
	
	
} // class
