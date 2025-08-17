package Method;

public class Methodex2 {

	public static void main(String[] args) {
//		String message = "Hell0, world!";
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(message);
//		}
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(message);
//		}
//		
//		for (int i = 0; i < 7; i++) {
//			System.out.println(message);
//		}
		
		
//		String message = "Hell0, world!";

		printMessage("Hell0, world!", 3);
		printMessage("java", 5);
		printMessage("hi", 7);
		
		
	} // main
	
	public static void printMessage(String message, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(message);
		}
	}
	
	
} // class
