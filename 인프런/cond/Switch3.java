package cond;

public class Switch3 {
    
    public static void main(String[] args) {
        
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // 이렇게 break를 안쓰고 하게 되면 case 3이 같이 출력이 된다.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
