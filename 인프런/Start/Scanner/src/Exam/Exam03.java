package Exam;

public class Exam03 {
	
	public static void main(String[] args) {
		
		// 최장 증가 연속 부분 배열 길이
	
		int[] arr = {10, 1, 3, 5, 4, 6, 8, 9, 2, 7};
	
		// 합계를 저장할 곳
		int max = 1;
		int count = 1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < arr[i+1]) {
				count ++;
				
				if (count > max) {
					max = count;
				}
			} else {
				count = 1;
			}
		}
		
		System.out.println(max);

	}
}
