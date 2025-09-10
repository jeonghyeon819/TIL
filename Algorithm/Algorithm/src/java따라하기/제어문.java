package java따라하기;

public class 제어문 {
	
	public static void main(String[] args) {
		
		System.out.printf("%s%n", "안녕");
		
		// printf (서식이 있는 출력)
		// %d : 정수형 출력
		// %s : 문자열 출력
		// %f : 실수형 출력
		// %c : 문자형 출력
		// %n : 줄 바꿈
		// %b : boolean 출력
		
		
		//////////////////////////////////////////////////
		
		
		// 1. 묵시적 형변환
		// - 범위가 작은 자료형 -> 범위가 큰 자료형으로
		int n1 = 100;
		long n2 = n1;
		
		// 2. 명시적 형변환
		// - 범위가 큰 자료형 -> 범위가 작은 자료형
		long n3 = 100;
		int n4 = (int) n3;
		
		// 리터럴
		// 값을 소스코드에 적는 것으로 데이터형에 따라서 표기 방법이 다르다.
		// long형 - 100L
		// floar형 - 12.321f
		
		
		//////////////////////////////////////////////////
		
		
		// 산술연산자 : 수학적인 연산
		// / : 나누기(몫)
		// % : 나누기(나머지)
		
		// 비교연산자 : 결과가 true, false로 나온다.
		
		// 논리연산자 : &&, ||, !
		
		// 대입 복합 연산자
//		int a = 1000;
//		
//		a += 10;
//		a = a + 10;
		
		// 단항 연산자
		int b = 100;
//		System.out.println(b++);
		System.out.println(++b);
		System.out.println(b);
		
		System.out.println(++b + b-- + b + --b);
		// 101 + 101 + 100 + 99 가 된다.
		
		
		// 삼항 연산자 = (조건) ? 참 : 거짓
		int c = 100;
		int d = 200;
		System.out.println(c > d ? c : d);
		
	}

}
