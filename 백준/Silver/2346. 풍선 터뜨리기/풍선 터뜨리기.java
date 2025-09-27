
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Deque<int[]> deque = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			int num = sc.nextInt();
			deque.add(new int[] {i, num});
		}
		
		StringBuilder sb = new StringBuilder();
		
		int[] first = deque.pollFirst();
		sb.append(first[0]).append(" ");
		int move = first[1];
		
		while (!deque.isEmpty()) {
			if (move > 0) {
				for (int i = 0; i < move - 1; i++) {
					deque.addLast(deque.pollFirst());
				}
				
				int[] next = deque.pollFirst();
				sb.append(next[0]).append(" ");
				move = next[1];
				
			} else {
				for (int i = 0; i < Math.abs(move); i++) {
					deque.addFirst(deque.pollLast());
				}
				
				int[] next = deque.pollFirst();
				sb.append(next[0]).append(" ");
				move = next[1];
				
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
