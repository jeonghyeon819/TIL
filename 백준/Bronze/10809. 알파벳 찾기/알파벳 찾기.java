
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		int[] position = new int[26];
		
		// 배열을 -1로 초기화
		Arrays.fill(position, -1);
		
		// 문자열 순회하면서 처음 등장하는 위치 기록
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';
			if (position[index] == -1) {
				position[index] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(position[i] + " ");
		}
		
	} // main

} // class
