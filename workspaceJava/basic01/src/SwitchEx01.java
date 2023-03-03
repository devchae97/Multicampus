

import java.util.Scanner;

public class SwitchEx01 {
	
	public static void main(String[] args) {
		
		// switch 문을 사용해 국어, 영어, 수학 입력받아 총점, 평균, 학점 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int k, e, m, t;
		double a;
		String grade;
		System.out.print("국어점수 = ");
		k = scan.nextInt();
		System.out.print("영어점수 = ");
		e = scan.nextInt();
		System.out.print("수학점수 = ");
		m = scan.nextInt();
		
		t = k + e + m;
		a = (double) t / 3;
	
		switch((int)(a/10)) {
		case 10 : case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		default :
			grade = "F";
		}
		
		System.out.printf("총점 = %d입니다.\n평균 = %.2f입니다.\n학점 = %s입니다.", t, a, grade);				

	}
}
