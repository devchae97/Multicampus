import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {

	public MyExceptionTest() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("���� = ");
			int n = scan.nextInt();
			// �Է¹��� ���� 1~100������ ���� �ƴѰ�� MyException���� �߻�
			if(n<1 || n>100) {
				// throw new MyException(); // ���� ���� �߻�
				throw new MyException("1���� 100������ �����Ͱ� �ʿ��մϴ�"); // ���ܹ߻�
			}
			sum(n);
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}catch(InputMismatchException ie) {
			System.out.println("���� �Է� �ٶ��ϴ�.");
		}
	}
	
	public void sum(int n) {
		int tot = 0;
		for(int i=1; i<=n; i++) {
			tot += i;
		}
		System.out.println("1~" + n + "������ ���� " + tot);
	}
	
	public static void main(String[] args) {
		new MyExceptionTest();
	}
}
