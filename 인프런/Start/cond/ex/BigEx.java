package cond.ex;

public class BigEx {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        // 이게 맞냐? 라고 했을 때 맞으면 a 아니면 b

        System.out.println("더 큰 숫자는 " + max + "입니다.");

    }
}
