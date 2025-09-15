
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// word라는 변수에 값을 받아오겠다.
		String word = sc.next();
		
		// 대문자로 받아오겠다.
		word = word.toUpperCase();

		// word의 길이만큼 cnt의 배열을 만들겠다.
		int[] cnt = new int[26];
		
		// word 길이만큼 반복하면서 cnt에 값을 넣는다.
		for (int i = 0; i < word.length(); i++) {
			cnt[word.charAt(i) - 'A']++;
		}

		int max = 0;
		char answer = '?';
		
		for (int i = 0; i < 26; i++) {
			
			if (cnt[i] > max) {
				max = cnt[i];
				answer = (char)(i + 'A');
			}
			
			else if (cnt[i] == max) {
				answer = '?';
			}
		
		}
		
		System.out.println(answer);
		
	}
}
