package basic01;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		
//		화폐(동전)수 구하기
//		50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
//
//		실행
//		금액=254535
//		50000원=5장
//		1000원=4장
//		500원=1개
//		10원=3개
//		5원=1개
//		금액=
//		:
//		:
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("금액 = ");
			int money = scan.nextInt();
			
			// 화폐 계산과 출력
			int won = 50000;
			int next = 5; // 다음 화폐를 만들때 사용 할 데이터
			
			while(money>0) {
				int count = money / won; // 화폐의 개수
				if(count>0) {
					System.out.print(won + "원 = " + count);
					String danwi = (won>=1000) ? "장" : "개";
					System.out.println(danwi);
				}
				// 남은 금액
				money -= count*won;
				// 다음 화폐단위
				won = won / next;
				// 다음 나눌 값
				if(next==5) next=2;
				else next=5;
			}
			
			System.out.print("계속하시겠습니까? (1.예, 2.아니오)");
			if (scan.nextInt() != 1) break; //1 외의 값은 프로그램 종료			
			
		}while(true);
		
		System.out.println("프로그램 종료");
	}
}
