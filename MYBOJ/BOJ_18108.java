// 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
// 반면, 우리나라는 서기 연도를 사용하고 있다.
// 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.

package MYBOJ;

import java.util.Scanner;

public class BOJ_18108 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt(); // 태국(불기)
		
		int year = (t - 543);
		
		System.out.print(year);
		
	} // main
} // class
