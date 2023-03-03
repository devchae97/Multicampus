package inheritance;

// extends : 클래스를 상속받을 때 사용 (1개만 상속가능)
public class Sedan extends Car {

	String color = "red";
	public Sedan() {
		// 하위클래스의 생성자 메소드에서 상위클래스 생성자 메소드를 호출하는 기능
		// 반드시 첫번째 실행문으로 기술
		super("blue", "bmw"); // this();
		System.out.println("Sedan() 생성자 메소드");
	}
	
	public Sedan(String color) {
		// 상속관계의 this는 현재 클래스가 우선, 현재클래스에 없을경우 상위 클래스에서 찾음
		this.color = color;
		
		// 상위클래스 하위클래스에 같은 멤버변수가 존재할때 상위클래스 멤버변수를 지정
		super.color = color;
		System.out.println(this.color + ", " + super.color);
	}
	
	// override : 상속관계에서 하위클래스에 메소드를 재정의
	public void speedUp() {
		speed += 10;
		if (speed>=200) speed=200;
	}
	
	// overloading : 같은 이름의 메소드, 매개변수의 유형과 개수의 차이
	public void speedUp(int lbl) {
		speed += lbl;
		if (speed>=200) speed=200;
	}
	
	public static void main(String[] args) {
		
		// 상속관계에서 생성자 메소드는 상위클래스 생성자가 먼저 실행
		
		Sedan s = new Sedan();
		System.out.println("color = " + s.color);
		s.speedUp();
		System.out.println("speed = " + s.speed);
		
		Sedan ss = new Sedan("white");
		System.out.println("Sedan.color = " + ss.color);
	}
}
