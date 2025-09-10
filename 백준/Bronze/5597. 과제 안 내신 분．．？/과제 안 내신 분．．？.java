import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 28;
		
		int[] arr = new int[num];
		
		// arr[i]에 하나씩 값을 넣는다.
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// 정렬한다.
		Arrays.sort(arr);
		
		// arr 배열 탐색용이 필요하다.
		int index = 0;
		
		for (int i = 1; i <= 30; i++) {
			if (index < arr.length && arr[index] == i) {
				index++;
			}
			
			else {
				System.out.println(i);				
			}
		}
		
		
	} // main

} // class
