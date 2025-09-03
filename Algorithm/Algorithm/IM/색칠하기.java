package IM;

import java.util.Scanner;

public class 색칠하기 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int redStartRow = scanner.nextInt();
			int redStartColumn = scanner.nextInt();
			
			int redEndRow = scanner.nextInt();
			int redEndColumn = scanner.nextInt();
			
			int blueStartRow = scanner.nextInt();
			int blueStartColumn = scanner.nextInt();
			
			int blueEndRow = scanner.nextInt();
			int blueEndColumn = scanner.nextInt();
			
			
			//////////////////////////////////
			
			
			int overlapRowStart = redStartRow > blueStartRow ? redStartRow : blueStartRow;
			
			int overlapRowEnd = redEndRow > blueEndRow ? blueEndRow : redEndRow;
			
			int overlapColStart = redStartColumn > blueStartColumn ? redStartColumn : blueStartColumn;
			
			int overlapColEnd = redEndColumn > blueEndColumn ? blueEndColumn : redEndColumn;
			
			
			///////////////////////////////////
			
			
			int row = overlapRowEnd - overlapRowStart + 1;
			int col = overlapColEnd - overlapColStart + 1;
			
			if (row <= 0 || col <= 0) {
				row = 0;
				col = 0;
			}
			
			System.out.println("#" + t + " " + col + " " + row);
		}
		
	} //main

} // class
