

public class Variable02 {

	public static void main(String[] args) {
		// char : 2byte
		
		char a = 'A';
		
		String grade = "A"; // grade++ 실행 시 에러
		
		char b = ' '; // String과 달리 빈값('') 주기 불가
		
		a++;
		System.out.println(a); // B
		++a;
		System.out.println(a); // C
		
		a = (char)(a + 1); // char + int
		System.out.println(a); // D
		
		int c = a + 1;
		System.out.println(c); // 69 (아스키코드 E=69)
	}
}
