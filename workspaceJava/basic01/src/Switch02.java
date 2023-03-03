

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		
//		월을 입력받아 봄, 여름, 가을, 겨울의 정보를 출력하는 프로그램을 작성하기
//		
//	 	봄 : 3, 4, 5
//	 	여름 : 6, 7, 8
//	 	가을 : 9, 10, 11
//	 	겨울 : 12, 1, 2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력 = ");
		int month = scan.nextInt();
		String season = "";
		
		if (month>=1 && month<=12) {
			switch(month) {
			case 3:
			case 4:
			case 5:
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			default :
				season = "겨울";
			}
		System.out.printf("%d월은 %s", month, season);		
		}else {
			System.out.println("월이 아닙니다.");
		}
		
	}
}
