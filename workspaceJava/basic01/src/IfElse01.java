

import java.util.Scanner;

public class IfElse01 {
	
	public static void main(String[] args) {
		
		// 실행문이 한 줄일 경우 중괄호 생략, 옆에 붙여쓰기 가능
		
		int a = 50;
		if(a>100) System.out.println(a); // 조건문 false이므로 미실행
		
		//--------------------------------------------------
		
		// 임의의 정수를 입력받아 1~100 사이의 값이면 값을 출력하고 그 외의 값은 양수로 만들어 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 = ");
		int num = scan.nextInt();
		
		if(num>=1 && num<=100) {
			System.out.println("num = " + num);
		}else {
			num = Math.abs(num); // 절대값 구하기
			System.out.println("num = " + num);
		}
		
	}
}
