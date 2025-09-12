package java따라하기;

import java.util.Random;

public class 기본3_클래스와객체_01 {
	
	public static void main(String[] args) {
		
//		System.out.println("아침에 일어난다.");
//		System.out.println("교육장으로 대중교통을 이용하여 이돟한다.");
//		System.out.println("오전 수업(Live)을 듣는다.");
//		System.out.println("점심을 먹는다.");
//		System.out.println("오후 수업(실습)을 진행한다.");
//		System.out.println("집으로 대중교통을 이용하여 이동한다.");
//		System.out.println("과제를 해결한다.");
//		System.out.println("잠을 잔다.");
		
		System.out.println("아침에 일어난다.");
		이동("교육장", "지하철");
//		boolean 과제 = 교육();
		이동("집", "어디로든 문");
//		if(과제 == true)
//		if(과제)
		if(교육())
			System.out.println("과제를 해결한다.");
		System.out.println("잠을 잔다.");
		
		//함수 - 관련된 문장들을 하나로 묶은 것(이름을 붙인 것) & 실행가능한 단위
	} /// main
		
		public static boolean 교육() {
			System.out.println("오전 수업(Live)을 듣는다.");
			System.out.println("점심을 먹는다.");
			System.out.println("오후 수업(실습)을 진행한다.");
			return new Random(). nextBoolean();
		}
		
		public static void 이동(String 장소, String 교통수단) {
			System.out.println(장소 + "(으)로 " + 교통수단 + "(을)를 이용하여 이동한다.");
		}

} // class
