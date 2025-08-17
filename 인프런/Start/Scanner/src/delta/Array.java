package delta;

import java.util.Arrays;

public class Array {
	
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 4, 7}; // 초기 배열 선언
        System.out.println("회전 전: " + Arrays.toString(arr));

        // 오른쪽으로 한 칸 회전
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("회전 후: " + Arrays.toString(arr));
    }
}