package basic01;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//		IfElseIfEx01의 문제를 배열로 풀어보기
//		
//		실행결과
//		국어점수 = 80
//		영어점수 = 90
//		수학점수 = 80
//		총점 = 250
//		평균 = 83.3
		
		Scanner scan = new Scanner(System.in);
		
		// 제목을 배열에 저장
		String title[] = {"국어","영어","수학","지구과학","물리"};
		int score[] = new int[title.length];
		
		// 점수 입력
		for(int i=0; i<score.length; i++) {
			System.out.print(title[i] + "점수 = ");
			score[i] = scan.nextInt();
		}
		
		// 총점
		int tot = 0;
		for(int i=0; i<score.length; i++) {
			tot += score[i];
		}
		
		// 평균
		int ave = tot / score.length;
		
		System.out.println("총점 = " + tot + "\n평균 = " + ave);
		
	}
}
