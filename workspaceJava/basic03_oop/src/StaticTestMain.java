
public class StaticTestMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		st.name = "흰둥이";
		
		System.out.println("st.name -> " + st.name);
		System.out.println("st2.name -> " + st2.name);
		
		// static 변수의 값 변경
		st.addr = "송파구";
		System.out.println("st.addr -> " + st.addr);
		System.out.println("st2.addr -> " + st2.addr);
		
		// static 멤버변수는 객체를 생성하지 않고 사용가능 ex) Math.PI -> public static final double PI = 3.14...
		System.out.println(StaticTest.addr);
		
		st2.setData("신형만"); // 객체명.메소드
		StaticTest.setAddr("종로구"); // 클래스명.메소드	static이기에 가능
		System.out.println(StaticTest.addr);
	}
}
