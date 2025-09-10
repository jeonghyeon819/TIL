package java따라하기;

public class 기본2_배열_03_최대최소합평균구하기 {
	
	public static void main(String[] args) {
		
		// 최소
		int[] nums = {64, 53, 123, 23, 444, 98, 12};
		
		int min = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) min = nums[i];
		}
		
		
		// 최대
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) max = nums[i];
		}
		
		
		// 합
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		
		// 평균
		double avg = (double) sum / nums.length;
		
		
		System.out.println("최소: " + min);
		System.out.println("최대: " + max);
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.10f", avg);
		
		
		// 다른 예
//		int min = nums[0];
//		int max = nums[0];
//		int sum = nums[0];
//		
//		for (int i = 1; i < nums.length; i++) {
//			if (min > nums[i]) min = nums[i];
//			if (max > nums[i]) max = nums[i];
//			sum += nums[i];
//		}
		
		
	} // main

} // class
