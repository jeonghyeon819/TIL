package Exam;

public class Exam0301 {

	public static void main(String[] args) {
		
		int[] arr = {10, 1, 3, 5, 4, 6, 8, 9, 2, 7};
		
		int max = 1;
		int count = 1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < arr[i+1]) {
				count++;
				
				if (max < count) {
					max = count;
				}
				
			} else {
				count = 1;
			}
		}
		
		System.out.println(max);
		
	} // main
} // class
