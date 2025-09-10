package java따라하기;

import java.util.Arrays;

public class 기본2_배열_01_배열 {
	
	public static void main(String[] args) {
		
		// 배열 선언
		int[] arr1;
		
		// 배열 초기화
		int[] arr2 = new int[10];
		
		// 길이를 직접 명시할 수 없음
		int[] arr3 = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr3));
		
		// 선언과 동시에 이루어질때만 가능
		String[] arr4 = {"박정현", "박정현", "박정현"};
		System.out.println(Arrays.toString(arr4));
		
		// 재할당 가능
		arr4 = new String[] {"리치", "리치", "리치"};
//		arr5 = {"박정현", "리치", "박정현"}; // 재할당 불가능
		System.out.println(Arrays.toString(arr4));
		
		
		//////////////////////////////////////////////////
		
		float[] floatArray = new float[3];
		double[] doubleArray = new double[5];
		char[] charArray = new char[5];
		boolean[] boolArray = new boolean[5];
		String[] strArray = new String[5];
		
		System.out.println(floatArray[0]);
		System.out.println(doubleArray[0]);
		System.out.println(charArray[0]);
		System.out.println(boolArray[0]);
		System.out.println(strArray[0]);
		
		
		//////////////////////////////////////////////////
		
		
		// 배열의 순회
		int[] intArray = {1, 3, 5, 7, 9};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		// for-each
		// for(요소 : 반복할 것)
		
		for (int x : intArray) {
			System.out.println(x*2);
		}
		
		System.out.println(Arrays.toString(intArray));
			
		
	} // main

} // class
