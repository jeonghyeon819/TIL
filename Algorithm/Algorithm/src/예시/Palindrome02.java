package 예시;
public class Palindrome02 {
    // 영문/숫자만 남기고 모두 소문자로 바꿔서 검사 (예: "A man, a plan..." 같은 경우)
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 왼쪽이 영숫자가 아니면 왼쪽 증가
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            // 오른쪽이 영숫자가 아니면 오른쪽 감소
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {
            "A man, a plan, a canal: Panama",
            "No 'x' in Nixon",
            "race a car",
            "12321",
            "123ab321"
        };
        for (String t : tests) {
            System.out.printf("\"%s\" -> %b%n", t, isPalindrome(t));
        }
    }
}
