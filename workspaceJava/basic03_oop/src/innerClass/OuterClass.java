package innerClass;
// 내부클래스는 클래스 내의 클래스
// 1. 클래스의 멤버영역에 내부클래스 만들기
// 2. 메소드 내 내부클래스 만들기
// 3. 익명의 내부클래스 만들기 : 메소드 내에 생성

public class OuterClass {

	String name = "신짱구";
	int age = 10;
	
	public OuterClass() {
		// 외부클래스에서 내부클래스의 멤버변수, 메소드에 접근이 불가능
		// System.out.println(addr); // 에러
		// 내부클래스에서 외부클래스의 멤버변수, 메소드에 접근 가능
	}
	
	public void output() {
		System.out.println("이름 = " + name);
	}
	
	// 내부클래스
	class InnerClass {
		String addr = "서초구 서초동";
		InnerClass(){
			output();
		}
		
		void memberOutput() {
			System.out.println("주소 = " + addr);
			System.out.println("이름 = " + name + ", 나이 = " + age);
		}
	}
	
	//--------------------------------------------------
	
	public static void main(String[] args) {
		// 내부클래스를 사용하기 위해서는 외부클래스가 객체 생성되어야 함
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.memberOutput();
		// 내부클래스 객체에서 외부클래스의 변수, 메소드는 호출불가
		// ic.output(); // 에러
		// oc.output();
		
		// 2. 객체생성방법
		OuterClass.InnerClass ic2 = new OuterClass().new InnerClass();
		ic2.memberOutput();
	}
}
