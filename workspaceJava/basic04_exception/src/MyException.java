
public class MyException extends Exception{

	// ����Ŭ������ �����ϱ� ���ؼ��� Exception�� ��ӹ޾� ����� ����
	
	public MyException() {
		// ����Ŭ������ Exception�� �����ڸ޼ҵ带 ȣ���� ���� �����޼����� ����
		super("1~100������ ���� ������ ���");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
