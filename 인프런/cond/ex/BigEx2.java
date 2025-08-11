package cond.ex;

public class BigEx2 {
    public static void main(String[] args) {
        
        //홀수 짝수 찾기
        // 정수 X가 주어지면 x가 짝수이면 짝수, 홀수이면 홀수를 출력하는 프로그램

        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("X = " + x + ", " + result);
    

    }
}
