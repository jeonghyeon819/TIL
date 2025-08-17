package cond;

// 새롭게 만들어진 Switch문
// 기존의 Switch문 보다는 간결해짐

public class Switch4 {
    
    public static void main(String[] args) {
        
        int grade = 3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);

    }
}
