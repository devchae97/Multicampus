
public class MyException extends Exception{

	// 예외클래스를 생성하기 위해서는 Exception을 상속받아 만들기 가능
	
	public MyException() {
		// 상위클래스인 Exception에 생성자메소드를 호출해 여러 에러메세지를 세팅
		super("1~100사이의 값의 범위를 벗어남");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
