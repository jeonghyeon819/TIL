package BOJ_03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15552_실패 {
	public static void main(String[] args) throws IOException {
        
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 출력을 빠르게 모아서 하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 줄: 테스트케이스 개수 T 입력 받기
        int T = Integer.parseInt(br.readLine());
        
        // T번 반복
        for (int i = 0; i < T; i++) {
            // 입력 줄 하나를 읽고 공백 기준으로 나누기
            String[] input = br.readLine().split(" ");
            
            // 두 정수를 A, B로 변환
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            // 결과를 문자열로 만들어서 출력 버퍼에 저장
            bw.write((A + B) + "\n");
        }
        
        // 모든 출력이 끝난 후 한 번에 내보내기
        bw.flush();
        
        // 사용한 자원 닫기
        br.close();
	}
}



//import java.io.*;
//→ 입력/출력을 위한 라이브러리 불러오기.
//
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//→ 입력을 빠르게 처리하기 위한 BufferedReader 선언.
//
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//→ 출력을 모아두었다가 한 번에 출력하기 위한 BufferedWriter 선언.
//
//int T = Integer.parseInt(br.readLine());
//→ 첫 줄에서 테스트케이스 개수 T를 입력받음.
//
//for (int i = 0; i < T; i++) { ... }
//→ 테스트케이스 개수만큼 반복.
//
//String[] input = br.readLine().split(" ");
//→ 한 줄 입력받아서 공백을 기준으로 나눔.
//
//int A = Integer.parseInt(input[0]);
//→ 나눈 문자열 중 첫 번째를 정수로 변환 (A).
//
//int B = Integer.parseInt(input[1]);
//→ 나눈 문자열 중 두 번째를 정수로 변환 (B).
//
//bw.write((A + B) + "\n");
//→ A+B 결과를 문자열로 변환해서 출력 버퍼에 저장.
//
//bw.flush();
//→ 모든 출력이 끝난 후 모아둔 내용을 한 번에 출력.
//
//br.close(); bw.close();
//→ 사용한 입력/출력 스트림을 닫아줌.





//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();  // 출력 모으는 역할
//
//        int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수
//
//        for (int i = 0; i < T; i++) {
//            String[] nums = br.readLine().split(" ");
//            int A = Integer.parseInt(nums[0]);
//            int B = Integer.parseInt(nums[1]);
//            sb.append(A + B).append("\n");  // 결과를 sb에 저장
//        }
//
//        System.out.print(sb); // 마지막에 한 번에 출력
//    }
//}
