

public class Variable01 { // 멤버변수 = 전역변수 (메소드 밖의 변수)
	
	public static void main (String[] args) { // 지역변수 (메소드 안의 변수)
		
		/* 변수 생성 규칙
		 * 1. 소문자, _, $ 로 시작
		 * 2. 영 대소문자, _, $, 숫자를 허용 (특수문자 사용 불가)
		 * 3. 합성어일 경우 두 번째 단어부터 첫번째 글자는 대문자 ex) homeworkJava
		 * 4. 변수의 길이는 256글자까지 허용
		 */
		
		byte kor = 80;
		int eng = 90;
		short mat = 75;
		
		// type casting : 형변환
		short total = (short)(kor + eng + mat);
		
		System.out.println("국어점수는" + kor);
		System.out.println("영어점수는" + eng);
		System.out.println("수학점수는" + mat);
		System.out.println("총점은" + total);
		
	}
}
