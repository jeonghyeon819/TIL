package cond.ex;

public class movieEx1 {
    public static void main(String[] args) {
        
        double rating = 8.5;

        if (rating >=9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        } else if (rating >=8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        } else {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
