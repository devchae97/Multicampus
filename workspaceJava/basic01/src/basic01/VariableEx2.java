package basic01;

import java.util.Scanner;

public class VariableEx2 {
	
	public static void main(String[] args) {
		
		// 임의의 정수를 입력받아 1~100 사이의 값이면 입력받은 값에 100을 곱하여 출력하고 그 외의 값은 0을 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 = ");
		int num = scan.nextInt();
		int result = (num>=1 && num<=100) ? num*100 : 0;
		System.out.println("출력값 = " + result);
	}
}
