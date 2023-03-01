package basic01;

import java.util.Scanner;

public class IfElseEx01 {
	
	public static void main(String[] args) {
		
//		실행결과
//		원하는 메뉴선택 (1.사각형의 넓이, 2.원의 넓이) ? 1
//		밑변=5
//		높이=6
//		사각형의 넓이=30
//		
//		원하는 메뉴선택 (1.사각형의 넓이, 2.원의 넓이) ? 2
//		반지름=5
//		원의 넓이=
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 메뉴선택 (1.사각형의 넓이, 2.원의 넓이) ?");
		int menu = scan.nextInt();
		if (menu==1) {
			System.out.print("밑변 = ");
			int w = scan.nextInt();
			System.out.print("높이 = ");
			int h = scan.nextInt();
			
			int result1 = w*h;
			System.out.println("사각형의 넓이 = " + result1);
		}else {
			System.out.print("반지름 = ");
			int r = scan.nextInt();
			
			double result2 = r*r*Math.PI; // PI
			System.out.println("Math.PI = " + Math.PI);
			System.out.println("원의 넓이 = " + result2);
		}
	}
}
