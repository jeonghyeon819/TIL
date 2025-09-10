package java따라하기;

import java.util.Arrays;

public class 기본2_배열_04_2차원3차원배열 {
	
	public static void main(String[] args) {
		
		// 선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		// 초기화
		int[][] arr4 = new int[2][3];
		// 행: 2, 열: 3
		
		
		// 2차원 배열 출력
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for (int[] a : arr4) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("----------");
		System.out.println(Arrays.deepToString(arr4));
		
		
		// 1차원 배열의 개수만 지정하고, 크기를 지정하지 않을 수 있다.
		int[][] arr5 = new int[5][];
		System.out.println(Arrays.deepToString(arr5));
		
		arr5[0] = new int[] {1, 2, 3};
		System.out.println(Arrays.deepToString(arr5));
		
		int[][] arr6 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr6));
		
		int[] arr7 = new int[0];
		System.out.println(arr7.length);
		
		
		//////////////////////////////////////////////////
		
		// 3차원 배열
		// 2*2 이미지의 RGB 값 저장을 위한 3차원 배열 생성
		int[][][] image = new int[2][2][3];
		
		// 각 픽셀의 RGB 값 할당
		// 픽셀 (0, 0)
		image[0][0][0] = 243; // Red
		image[0][0][1] = 103; // Green
		image[0][0][2] = 224; // Blue
		// 픽셀 (0, 1)
		image[0][1][0] = 255; // Red
		image[0][1][1] = 159; // Green
		image[0][1][2] = 67; // Blue
		// 픽셀 (1, 0)
		image[1][0][0] = 21; // Red
		image[1][0][1] = 210; // Green
		image[1][0][2] = 211; // Blue
		// 픽셀 (1, 1)
		image[1][1][0] = 84; // Red
		image[1][1][1] = 160; // Green
		image[1][1][2] = 255; // Blue
		// 이미지의 RGB 값 출력
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.println("Pixel (" + i + ", " + j + ") - " + "R: " + image[i][j][0] + ", " + "G: "
						+ image[i][j][1] + ", " + "B: " + image[i][j][2]);
			}
		}
		
	} // main

} // class
