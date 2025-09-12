// 가장 최상단에 위치해야 한다. (폴더와 비슷한 구조)
package java따라하기;

// 여기에는 import가 들어오는 자리 -> 여러 개가 올 수 있다. (기본으로 들어있는 패키지가 있다)

// class Test1 {
//}
//class Test2 {
// } -> 이렇게 만들어두면 bin/3개의 .class 파일이 생성된다.

// public class 는 딱 1개만 올 수 있다.
// id는 고유한 식별자
// 필드는 인스턴스 변수이다.
public class 기본4_Person {
	
	private String name;
	private int age;
	private int height;
	private String mbti;
	private boolean hungry;
	
	// 기본 생성자
	public 기본4_Person() {
		
	}
	
	// 전체 필드 초기화 생성자
	public 기본4_Person(String name, int age, int height, String mbti; boolean hungry) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.mbti = mbti;
		this.hungry = hungry;
	}
	
	// 접근자 & 설정자 = get & set
	public void setName(String name) {
		this.name = name;
		// return 생략 가능 void 이기 때문에
	}
	
	// 반환 타입 String -> return 필수
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getMbti() {
		return mbti;
	}
	
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
		
	
	// 정보를 보이자! info() -> toString() 메서드를 사용을 하더라!
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", mbti=" + mbti + ", hungry=" + hungry
				+ "]";
	}

} // class