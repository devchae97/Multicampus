package inheritance;

// 최상위 클래스 Object는 굳이 안써도 가능
public class Car extends Object {

	int speed = 0;
	String color = "black";
	String brand = "benz";
	
	public Car() {
		System.out.println("Car() 생성자 메소드");
	}
	
	public Car(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	public void speedUp() {
		speed ++;
		if(speed>=100) {
			speed = 100;
		}
	}
	
	public void speedDown() {
		speed--;
		if(speed<=0) {
			speed = 0;
		}
	}
}
