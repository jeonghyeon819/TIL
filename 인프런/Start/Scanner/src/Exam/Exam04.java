package Exam;

import java.util.Scanner;



public class Exam04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt(); // testcase 갯수

        for(int i = 0; i < t; i++) {

            int N = sc.nextInt(); // N 3행
            int M = sc.nextInt(); // M 5열
            int count = 0;

            int[][] array = new int[N][M]; // 배열 선언


            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) { // 3행 5열
                    array[j][k] = sc.nextInt();
                }
            }

            int r = sc.nextInt(); // 초기 행
            int c = sc.nextInt(); // 초기 열

            // 상 하 좌 우 우상 우하 좌상 좌하
            int[] dr = {-1,1,0,0,-1,1,-1,1};
            int[] dc = {0,0,-1,1,1,1,-1,-1};

            for (int k = 0; k < 8; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < N && nc >= 0 && nc <M) {
                    count += array[nr][nc];
                }
            }
            System.out.println(count);
        }
    }
}
