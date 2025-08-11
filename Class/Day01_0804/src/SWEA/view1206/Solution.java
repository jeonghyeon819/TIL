package SWEA.view1206;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	// 파일을 가져오기 위한 코드
	// 파일 경로를 넣어줘야 한다.
	// .은 내가 있는 곳 -> 프로젝트에서부터 ./
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// 아래 3개는 필수는 아니지만 그래도 처음부터 해놓으면 좋을 거 같다.
		File file = new File("./src/SWEA/view1206/sample_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		sc.close();
	} // main
}
