

public class PrintfTest {

	public static void main(String[] args) {
		
		// printf() : 출력 시 문자열 또는 숫자를 자릿수 지정해 출력 가능
		// inputStream 클래스의 print(), println(), printf()
		// printf 의 f는 format의 f
		
		// 제어문자 : \", \', \t : tap, \n : 줄바꿈
		// 나의 이름은 채한준입니다.
		// 나의 이름은 "채한준"입니다.
		System.out.println("나의 이름은\n\"채한준\"입니다.");
		
		int a = 125;
		double b = 235.2356485;
		String name = "채한준";
		
		//				 (pattern, 변수)
		// decimal 십진수, 정수 : %d, 실수 : %f, 문자열 : %s, 1문자 : %c
		
		System.out.printf("a변수의 값은 %-10d입니다.\n", a); // "a변수의 값은 125       입니다."
		// -10d : (숫자먼저)숫자포함 10자리, printf는 자동 줄바꿈 X
		// 10d : (공백먼저)숫자포함 10자리
		System.out.printf("%10.3f\n", b); // "   235.236"
		// 소숫점 포함 10칸, 소숫점 밑 3자리
		System.out.printf("나의\t이름은 \"%5s\"입니다.\n", name ); // "나의	이름은 "  채한준"입니다." 이름포함 5칸
		System.out.printf("%5s\n", "ABC"); // "  ABC"
		System.out.printf("%4c\n", 'z'); // "   z"
		System.out.printf("a =%5d, b =%7.2f, name =%s",a,b,name); // "a =  125, b = 235.24, name =채한준"
	}
}
