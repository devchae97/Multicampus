package basic01;

public class If01 {

	public static void main(String[] args) {
		
		// 조건문 : if문
		/*
			if(조건식){
				실행문;
				출력문;
				수식;
				변수선언;
			}
		 */
		
		int data = 110;
		
		// 조건식의 값이 참일 경우 실행문 실행
		
		if(data>100) {
			int a = 50;
			int b = a*12;
			System.out.println("b = " + b);
		}
		System.out.println("data = " + data);
		// System.out.println("a =" + a); // a는 if문의 지역변수이기에 접근 불가
	}
}
