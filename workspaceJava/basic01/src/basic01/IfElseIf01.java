package basic01;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 = ");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("입력값은 양수");
		}else if(num<0) {
			System.out.println("입력값은 음수");
		}else {
			System.out.println("입력값은 0");
		}
	}
}
