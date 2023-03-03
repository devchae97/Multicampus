package inheritance;

// �ֻ��� Ŭ���� Object�� ���� �Ƚᵵ ����
public class Car extends Object {

	int speed = 0;
	String color = "black";
	String brand = "benz";
	
	public Car() {
		System.out.println("Car() ������ �޼ҵ�");
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
