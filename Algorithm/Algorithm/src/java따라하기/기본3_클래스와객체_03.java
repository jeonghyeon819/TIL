package java따라하기;

public class 기본3_클래스와객체_03 {
	
	public static void main(String[] args) {
		
		기본3_Person park = new 기본3_Person();
		
		park.name = "Park";
		park.age = 25;
		park.hobby = "Youtube";
		
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s입니다.%n", park.name, park.age, park.hobby);
		
		
		기본3_Person shin = new 기본3_Person();
		shin.name = "Shin";
		shin.age = 25;
		shin.hobby = "Movie";
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s입니다.%n", shin.name, shin.age, shin.hobby);
		
		
		info(park.name, park.age, park.hobby);
		info(shin.name, shin.age, shin.hobby);
		
	} // main
	
	
	public static void info(String name, int age, String hobby) {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는 %s입니다.%n", name, age, hobby);
	}

} // class
