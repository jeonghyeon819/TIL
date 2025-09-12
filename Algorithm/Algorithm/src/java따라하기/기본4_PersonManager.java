package java따라하기;

// 딱 1개만 만들어지도록 -> 싱글턴 패턴을 적용해보자!
public class 기본4_PersonManager {

	int size = 0;
	private 기본4_Person[] arr = new 기본4_Person[100];
	
	// 1. 외부에서 생성하지 못하도록 막아야 한다.
	private 기본4_PersonManager() {
		
	}
	
	// 2. 외부에서 생성하지 못하니 내가 생성해서 가지고 있자!
	// 4. 얘네도 미리 메모리에 올려두자
	private static 기본4_PersonManager manager = new 기본4_PersonManager();
	
	// 3. 내가 만든 Manager를 외부에서 쓸 수 있게 해줘 (접근자)
	// 3-1. 그런데 외부에서 인스턴스를 만들 수는 없다! -> static 키워드를 통해 미리 메모리에 올리자
	public static 기본4_PersonManager getManager() {
		return manager;
	}
}
