

import java.util.Scanner;

public class IfEx01 {
	
	public static void main(String[] args) {
		
//		입력받은 금액이 10000 이상인 경우 마지막자리값을 0으로 바꿔서 출력하기
//		
//		실행
//		금액입력 = 26315
//		결과 = 26310
//
//		금액입력 = 568259
//		결과 = 568250
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액 입력 = ");
		int num = scan.nextInt();
		
		if(num>=10000) {
			int result = num/10*10;
			System.out.print("결과 = " + result);
		}
		
		

	}
}
