package basic02_api;

public class WrapperClass {

	public WrapperClass() {
		int i = 500;
		// Wrapper 클래스
		// Byte, Short, Integer, Long
		// Float, Double
		// Character
		
		// i를 객체로 만들기
		Integer intObj = Integer.valueOf(i);
		
		System.out.println(intObj.MAX_VALUE); // 2147483647, Integer.BYTES
		System.out.println(intObj.MIN_VALUE); // -2147483648
		
		Integer intObj2 = i; // 기본데이터형이 객체화, 오토박싱
		int con = intObj; // Wrapper 클래스에서 기본데이터형으로 변환, 오토언박싱
		
		String data = "254";
		// 문자열을 숫자로 변경
		Integer y = new Integer(data); // new Integer(i) : 권장하지 않는 의미로 취소선 발생
		int z1 = Integer.parseInt(data); // int, parseInt() : 문자열에서 숫자를 추출
		Integer z2 = Integer.valueOf(data); // Integer
		int z3 = Integer.valueOf(data); // Integer
		System.out.println(z1*2); // 508
		System.out.println(z2*3); // 762
		
	}
	
	public static void main(String[] args) {
		new WrapperClass();
	}
}
