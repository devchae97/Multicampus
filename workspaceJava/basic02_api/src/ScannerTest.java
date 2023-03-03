

// 컴파일러가 java.lang 패키지의 클래스는 자동으로 import를 추가
import java.lang.System;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// 실행 중 콘솔에서 데이터를 입력받아 처리
		// 정수, 실수, 논리, 문자열, 문자형
		
		// new : 객체생성 (클래스 이용)
		
		Scanner scan = new Scanner(System.in);
		
		// 정수 : nextInt(), 실수 : nextDouble(), 문자열 : nextLine()
		
		System.out.print("이름 = ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.print("국어점수 = ");
		int kor = scan.nextInt();
		System.out.println("kor = " + (kor/2));
		
		System.out.print("수학(실수) = ");
		double math = scan.nextDouble(); // 95.23
		System.out.println("math = " + (math+100));
	}
}
