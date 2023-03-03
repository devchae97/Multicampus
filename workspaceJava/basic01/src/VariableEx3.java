

import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		
		// 선택에 따라 사각형의 넓이, 사각형의 둘레를 구하기
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("선택 : 1. 사각형의 넓이, 2. 사각형의 둘레 = ");
		int menu = s.nextInt();
		
		System.out.print("사각형의 가로길이 = ");
		int width = s.nextInt();
		
		System.out.print("사각형의 세로길이 = ");
		int height = s.nextInt();
		
		int result = (menu==1) ? width*height : 2 * (width + height);
		String rabel = (menu==1) ? "넓이" : "둘레";
		System.out.println("사각형의 " + rabel + "는 = " + result);
		
	}
}
