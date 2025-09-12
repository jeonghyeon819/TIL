package 예시;
public class Palindrome01 {
    // 대소문자 구분하고 공백 등 그대로 비교하는 단순한 검사
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"level", "racecar", "Hello", "A man, a plan, a canal: Panama"};
        for (String t : tests) {
            System.out.printf("\"%s\" -> %b%n", t, isPalindrome(t));
        }
    }
}
