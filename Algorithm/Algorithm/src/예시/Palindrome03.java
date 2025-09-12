package 예시;
import java.util.Scanner;

public class Palindrome03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단어 입력: ");
        String word = sc.next();  // 단어 입력받기

        // 문자열 뒤집기
        String reversed = new StringBuilder(word).reverse().toString();

        // 비교하기
        if (word.equals(reversed)) {
            System.out.println(word + " → 회문입니다!");
        } else {
            System.out.println(word + " → 회문이 아닙니다!");
        }

    }
}
