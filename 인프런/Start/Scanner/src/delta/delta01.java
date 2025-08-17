package delta;

public class delta01 {

	    static int[] dx = {0, 1, 0, -1};
		static int[] dy = {1, 0, -1, 0}; // 오른쪽 아래 왼쪽 위

	    public static void main(String[] args) {
	        int N = 4;
	        int[][] map = { {1, 2, 3, 4},
	                        {5, 6, 7, 8},
	                        {3, -5, 3, 4},
	                        {5, 5, 3, 2}};

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.printf(map[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("타겟의 오른쪽, 아래, 왼쪽, 위 순으로 출력");
	        System.out.println("--------------");
		        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (map[i][j] == -5) {
	                    System.out.printf("x = %d y = %d\n", j, i);
	                    for (int d = 0; d < N; d++) {
	                        int nx = i + dx[d];
	                        int ny = j + dy[d];
		                        
	                        // 이 아래가 예외 처리 (유효하지 않은 범위)
	                        if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
	                            continue;
	                        }
	                        System.out.println(map[nx][ny]);
	                    }
	                    System.out.println("--------------");
	                }
	            }
	        }
	    }
}
