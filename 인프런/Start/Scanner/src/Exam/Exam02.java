package Exam;

import java.util.Arrays;

public class Exam02 {
	
	public static void main(String[] args) {
		
		// 배열을 만든다.
		int[] arr = {3, 8, 1, 4, 7};
		System.out.println("회전 전 : " + Arrays.toString(arr));
		
		// 오른쪽으로 한 칸 회전
		int last = arr[arr.length -1];
		
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
		
		System.out.println("회전 후 : " + Arrays.toString(arr));
		
	} // main
} // class
