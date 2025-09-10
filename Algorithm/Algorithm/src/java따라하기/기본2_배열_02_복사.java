package java따라하기;

import java.util.Arrays;

public class 기본2_배열_02_복사 {
	
	public static void main(String[] args) {
		
		// 얕은 복사(참조 공유)
		int[] original = { 1, 2, 3 };
		int[] shallowCopy = original;

		shallowCopy[0] = 10;

		System.out.println("원본 배열: " + Arrays.toString(original)); // [10, 2, 3]
		System.out.println("복사본 배열: " + Arrays.toString(shallowCopy)); // [10, 2, 3]
		
		
		// 깊은 복사
		int[] original = { 1, 2, 3 };
		int[] deepCopy = new int[original.length];
		
		for(int i  = 0 ; i<original.length; i++) {
			deepCopy[i] = original[i];
		}
		deepCopy[0] = 10;

		System.out.println("원본 배열: " + Arrays.toString(original)); // [1, 2, 3]
		System.out.println("복사본 배열: " + Arrays.toString(deepCopy)); // [10, 2, 3]
		
		
		// 복사메서드
		int[] nums = { 1, 22, 42, 1992, 31, 2, 23, 11 };
		nums[0] = 1000;
		System.out.println(Arrays.toString(nums));

		// Arrays.copyOf(원본배열, 새로운배열의크기)
		int[] tmp1 = Arrays.copyOf(nums, nums.length * 2);
		tmp1[0] = 1001;
		System.out.println(Arrays.toString(tmp1));

		// Arrays.copyOfRange(원본배열, 시작점, 끝인덱스);
		int[] tmp2 = Arrays.copyOfRange(nums, 0, nums.length * 2);
		tmp2[0] = 1002;
		System.out.println(Arrays.toString(tmp2));

		// System.arraycopy(원본배열, 원본배열시작점, 복사배열, 복사배열의시작점, 복사길이);
		int[] tmp3 = new int[nums.length * 2];
		System.arraycopy(nums, 0, tmp3, 0, nums.length);
		tmp3[0] = 1003;
		System.out.println(Arrays.toString(tmp3));
		
		
	} // main

} // class
