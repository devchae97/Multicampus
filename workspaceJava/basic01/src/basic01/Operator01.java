package basic01;

public class Operator01 {

	public static void main(String[] args) {
		// 연산자 : +, =, *, /(나누기), %(나머지)
		
		int num1 = 10;
		int num2 = 3;
		
		// 정수 + 정수 = 정수
		// 정수 + 실수 = 실수
		// 실수 + 실수 = 실수
		
		int result = num1 / num2; // 3
		double result2 = num1 / (double)num2; // 3.33333
		int result3 = (int)(num1 / (double)num2); // 3
		
		System.out.println(result + ", " + result2 + ", " + result3);
		
		//--------------------------------------------------
		
		// 증감연산자 : ++, --
		
		int a = 10;
		
		// 1 증가
		// a++; 나 ++a; 나 단독 사용 시 증감연산자가 앞 뒤 어디에 위치하든 결과는 같음
		// a = a + 1;	a = 1 + a;
		a += 1;
		System.out.println(a); // 11
		
		// 1 감소
		// a--;	--a;	a = a - 1;
		a -= 1;
		System.out.println(a); // 10
		
		// 연산자 ++가 대입문 내 수식으로 들어갈때, 위치에 따라 차이 발생
		// b++ : 변수 오른쪽에 위치 시 산술 계산 후 ++증감 진행
		// ++b : 변수 왼쪽에 위치 시 ++증감 후 산술 계산
		// 괄호가 있으면 괄호우선
		
		int b = 5;
		int r1 = b++ + 100;
		System.out.println("b = " + b + ", r1 = " + r1); // b = 6, r1 = 105
		
		int r2 = ++b + 100;
		System.out.println("b = " + b + ", r2 = " + r2); // b = 7, r1 = 107
		
		int t = 3;
		int r3 = 5 / 7 + 10 % 2 - 3 + t++ *2; // 0 + 0 - 3 + (3 * 2);
		System.out.println("t = " + t + ", r3 = " + r3); // t = 4, r3 = 3
		
		//--------------------------------------------------
		
		// 비교(관계연산자) : ==, !=, >, <, >=, <=
		// 논리 연산자 : &&(and), ||(or) *and가 or보다 우선
		
		boolean r4 = b >= t; // true or false b=7, t=4
		System.out.println("r4 = " + r4); // r4 = true
		
		boolean r5 = a > b + t * 2; // a= 10, b=7, t=4 false
		System.out.println("r5 = " + r5); // r5 = false
				
		// 1~100 값이면 true, 아니면 false의 식을 세워보기
		// 1 <= data <= 100
		
		int data = 50;
		
		boolean r6 = data >= 1 && data <= 100;
		System.out.println("r6 = " + r6); // r6 = true
		
		//--------------------------------------------------
		
		// 삼항연산자 : 변수 = (조건식)? 참 : 거짓 ;
		// (조건식)?A:B 조건에 따라 A나 B를 선택
		
		int x = 5;
		String r7 = (x%2==1)?"odd":"Even"; // 홀 짝 판별
		// String r7 = (x/2==x/2.0)?"Even":"odd";
		System.out.println("r7 = " + r7); // odd
		
		int r8 = (x%2==1)? x-100 : x*100; // 홀수면 -100, 짝수면 *100
		System.out.println("r8 = " + r8); // -95
		
		// 삼항연산자 내에 삼항연산자 사용 가능
		
		String r9 = (x>0)?"Positive":(x<0)?"Negative":"Zero"; // 양수면 Positive, 음수면 Negative, 0이면 Zero
		System.out.println("r9 = " + r9); // Positive
		
	}
}
