package Method;

public class Method02 {

	public static void main(String[] args) {
		printHeader();
		System.out.println("= 프로그램이 동작합니다. =");
		printFooter();
		
	} // main
	
	public static void printHeader() {
		
		System.out.println("= 프로그램을 시작합니다 =");
		return; // void의 경우 생략 가능하다. return을 만나면 해당 메서드는 종료된다.
	
	}
	
	public static void printFooter() {
		
		System.out.println("= 프로그램을 종료합니다 =");
	
	}
	
} // class
