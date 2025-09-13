import java.util.*;

public class Solution {
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0}; // 상하좌우
    static int[] dc = {0, 0, -1, 1};
    static int N = 16; // 문제에서 16x16 고정
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10; // 문제에서 10개의 테스트케이스
        for (int tc = 1; tc <= T; tc++) {
            sc.nextInt(); // 테스트케이스 번호 (버림)
            map = new int[N][N];
            visited = new boolean[N][N];
            answer = 0;

            int startR = 0, startC = 0;

            // 입력 받기
            for (int i = 0; i < N; i++) {
                String line = sc.next();
                for (int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j) - '0';
                    if (map[i][j] == 2) { // 시작점
                        startR = i;
                        startC = j;
                    }
                }
            }

            bfs(startR, startC);

            System.out.println("#" + tc + " " + answer);
        }
    }

    // BFS 탐색
    static void bfs(int r, int c) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {r, c});
        visited[r][c] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cr = cur[0];
            int cc = cur[1];

            for (int d = 0; d < 4; d++) {
                int nr = cr + dr[d];
                int nc = cc + dc[d];

                // 범위 체크
                if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                // 벽이거나 방문했으면 넘어가기
                if (map[nr][nc] == 1 || visited[nr][nc]) continue;

                // 도착점(3)을 만나면 성공
                if (map[nr][nc] == 3) {
                    answer = 1;
                    return;
                }

                // 방문 가능한 곳
                q.add(new int[] {nr, nc});
                visited[nr][nc] = true;
            }
        }
    }
}
