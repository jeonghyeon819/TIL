package java따라하기;

import java.util.Arrays;

public class 기본2_배열_03_빈도수구하기 {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 2, 5, 2, 5, 1, 2, 3, 4, 9};
		
		// 카운팅 배열 만들기
		int[] count = new int[10];
		// count[0]? -> 쓰지 않는다.
		// count[1] : 1의 개수
		// count[2] : 2의 개수
		// ...
		// count[9] : 9의 개수
		
		System.out.println(Arrays.toString(count));
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				System.out.println(i + " : " + count[i] + "번");
			}
		}
		
	} // main

} // class
