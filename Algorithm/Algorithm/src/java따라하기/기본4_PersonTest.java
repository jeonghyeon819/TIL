package java따라하기;

public class 기본4_PersonTest {
	public static void main(String[] args) {
		기본4_Person p = new 기본4_Person("박싸피", 50, 190, "INFJ", false);
		기본4_Person p = new 기본4_Person("박싸피", 50, 190, "INFJ", false);
		
		
		기본4_PersonManager mgr1 = 기본4_PersonManager.getManager();
		기본4_PersonManager mgr2 = 기본4_PersonManager.getManager();
		
		System.out.println(1==1); //기초자료형에서는 값을 비교한다!
		System.out.println(mgr1 == mgr2); //참조 주소를 비교한다.
		System.out.println(p == p2);
		
		System.out.println(0.1+0.1+0.1);
		
	}

}
