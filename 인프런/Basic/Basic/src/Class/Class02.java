package Class;

public class Class02 {
		
	public static void main(String[] args) {
	
		String[] student = {"학생1", "학생2"};
		
		int[] studentage = {15, 16};
		
		int[] gradestudent = {90, 80};
		
		
//		System.out.println("이름: " + student[0] + " 나이: " + studentage[0] + " 성적: " + gradestudent[0]);
//		System.out.println("이름: " + student[1] + " 나이: " + studentage[1] + " 성적: " + gradestudent[1]);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("이름: " + student[i] + " 나이: " + studentage[i] + " 성적: " + gradestudent[i]);
		}
	
	}
	
}
