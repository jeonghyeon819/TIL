package Method;

public class Method01 {

	public static void main(String[] args) {
		
		// 계산1
		int sum1 = add(5, 10);
		System.out.println("결과1 출력: " + sum1);
		
		// 계산2
		int sum2 = add(10, 20);
		System.out.println("결과2 출력: " + sum2);
		
	} // main
	
		
	// add 메서드
	public static int add(int a, int b) { // 여기가 메서드의 선언 부분으로 메서드 이름, 반환 타입, 매개변수(파라미터) 목록을 포함한다. -> 이런 메서드가 있다고 선언하는 것
		System.out.println(a + "+" + b + " 연산 수행");
		int sum = a + b;
		return sum;
		
	}
		
		
} // class
