package pac;

public class Information {

	int num = 1234;
	protected String userid = "devchae97";
	
	protected Information() {
		System.out.println("Information의 생성자 메소드");
	}
	
	String getUserid() {
		return userid;
	}
	
	public static Information getInstance() {
		return new Information();
	}
}
