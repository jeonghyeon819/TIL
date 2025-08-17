package Exam;

import java.util.Arrays;

public class Exam0201 {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 8, 1, 4, 7};
		System.out.println("회전 전 : " + Arrays.toString(arr));
		
		int last = arr[arr.length-1];
		
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
		
		System.out.println("회전 후 : " + Arrays.toString(arr));
		
	} // main

} // class
