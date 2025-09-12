package java따라하기;

public class 기본3_클래스와객체_02 {
	
	public static void main(String[] args) {
		// 사람의 정보를 관리하자!
		
		String name1 = "Yang";
		int age1 = 45;
		String hobby1 = "Youtube";
		
		String name2 = "Park";
		int age2 = 25;
		String hobby2 = "Music";
		
		// 이렇게 100명이라면 너무 힘들다
		
		int size = 100;
		String[] names = new String[size];
		int[] ages = new int[size];
		String[] hobbies = new String[size];
		
		names[0] = "Yang";
		names[1] = "Park";
		ages[0] = 45;
		ages[1] = 25;
		hobbies[0] = "Youtube";
		hobbies[1] = "Music";
		
	} // main

} // class
