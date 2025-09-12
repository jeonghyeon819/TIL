package java따라하기;

// 기본3 클래스와 객체 03
public class 기본3_Person {
		
	String name;
	int age;
	String hobby;
	
	
	//기능(매개변수가 X)
	void info() {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는%s입니다.%n", name, age, hobby);
	}
		
		
	//기능(매개변수O)
	void study(int time) {
		//int time = ?(호출 시 넘겨준 값)
		System.out.println(time + "시간 만큼 공부를 했습니다.");
	}	
		
		
	//메서드 오버로딩
	//이름이 같으면서, 매개변수가 다른 메서드 (파라미터의 타입, 개수, 순서가 달라야함)
	void study(long time) {
			
	}
		
	void study(double time) {
			
	}
		
	void study(int time1, int time2) {
			
	}
		
//	void study(int time2, int time1) {
//			
//	}
		
	void study(String str, int time) {
			
	}
		
	void study(int time, String str) {
		
	}
		
		
		
} // class
