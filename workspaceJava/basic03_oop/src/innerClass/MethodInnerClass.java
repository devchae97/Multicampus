package innerClass;

public class MethodInnerClass {

	int age = 25;
	public MethodInnerClass() {
		
	}
	
	public void start() {
		String tel = "010-1234-5678";
		// 내부 클래스
		class InnerTest{
			int num = 100;
			String name = "신짱아";
			InnerTest(){}
			InnerTest(int num, String name){
				this.num = num;
				this.name = name;
			}
			void print() {
				System.out.println(num + " -> " + name);
				System.out.println("나이 = " + age);
				System.out.println("연락처 = " + tel);
				
				// 클래스가 정의된 이후 값은 접근 불가
				//System.out.println("주소 = " + addr); // 에러
			}
		}
		
		String addr = "강남구 역삼동";
		
		InnerTest it = new InnerTest(500, "흰둥이");
		it.print();
	}
	
	
	public static void main(String[] args) {
		MethodInnerClass mic = new MethodInnerClass();
		mic.start();
	}
}
