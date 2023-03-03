

public class StringBufferTest {

	public static void main(String[] args) {
		
		// String : 연산이 적은 데이터 스레드(동기화) 가능, immutable
		// StringBuffer : 연산이 많고 스레드가능, mutable
		// StringBuilder : 연산이 많고 동기화를 고려하지 않을 때
		
		// StringBuffer sb = new StringBuffer(30); // Buffer의 capacity 지정
		StringBuffer sb = new StringBuffer("Java Programming Test...");
		//									012345678901234567890123	33
		sb.append("체크중"); // append : 마지막에 추가, sb = sb.append("체크중"); a = a + "ddd";
		sb.insert(4, "(자바)"); // insert : index 4 앞에 "(자바)" 삽입
		
		System.out.println(sb); // Java(자바) Programming Test...체크중
		
		sb.delete(5, 10); // delete : index 5 뒤부터 10 앞까지 지우기
		System.out.println(sb); // Java(rogramming Test...체크중
		
		sb.reverse(); // reverse : 거꾸로 뒤집기
		System.out.println(sb); // 중크체...tseT gnimmargor(avaJ
		
		// 확보한 메모리 확인
		System.out.println("capacity -> " + sb.capacity()); // 40
		
		StringBuffer first = new StringBuffer("Java");
		StringBuffer second = new StringBuffer("JAVA");
		
		// equals();
		// compareTo() : 문자와 문자를 비교해 정수를 리턴
		int result = first.compareTo(second); // "Java" - "JAVA", 32
		// 첫 문자 J는 둘다 대문자로 동일, 두번째 a=97, A=65 이므로 97-65 = 32, 순서가 정해졌기에 이후 va는 신경쓰지않음
		int result2 = second.compareTo(first); // "JAVA" - "Java", -32
		// 0 : 두 객체의 데이터가 동일, 양수 : 왼쪽 객체의 데이터가 큼, 음수 : 왼쪽 객체의 데이터가 작음
		System.out.println("result : " + result + ", result2 : " + result2); // result : 32, result2 : -32
	}
}
