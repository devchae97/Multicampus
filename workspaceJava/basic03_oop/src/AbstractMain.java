
public class AbstractMain extends AbstractTest{
	
	// 추상클래스는 반드시 상속받아 추상메소드를 오버라이딩해 사용
	
	AbstractMain(){}
	
	void output() {
		System.out.println("번호 = " + num);
		System.out.println("이름 = " + name);
	}
	
	void getName() {}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		am.output();
	}
}
