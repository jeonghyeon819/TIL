import java.util.*;

public class Main {
    
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int N;
	static int M;
	static int answer;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visited = new boolean[N][M];
		answer = 0;
		
		int startR = 0, startC = 0;
		
		for (int i = 0; i < N; i++) {
			String Line = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = Line.charAt(j) - '0';
			}
		}
		
		int answer = bfs(startR, startC);
		System.out.println(answer);
	}
	
	//bfs
	static int bfs(int r, int c) {
		Queue<int[]> q = new ArrayDeque<>();
		q.add(new int[] {r, c, 1});
		
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int cr = cur[0];
			int cc = cur[1];
			int dist = cur[2];
			
			if (cr == N-1 && cc == M-1) {
				return dist;
			}
			
			for (int d = 0; d < 4; d++) {
				int nr = cr + dr[d];
				int nc = cc + dc[d];
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
				if (map[nr][nc] == 0 || visited[nr][nc]) continue;
				
				
				q.add(new int[] {nr, nc, dist+1});
				visited[nr][nc] = true;
			}
		}
        
		return -1;
	}
}
