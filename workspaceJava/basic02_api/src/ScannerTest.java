

// �����Ϸ��� java.lang ��Ű���� Ŭ������ �ڵ����� import�� �߰�
import java.lang.System;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// ���� �� �ֿܼ��� �����͸� �Է¹޾� ó��
		// ����, �Ǽ�, ��, ���ڿ�, ������
		
		// new : ��ü���� (Ŭ���� �̿�)
		
		Scanner scan = new Scanner(System.in);
		
		// ���� : nextInt(), �Ǽ� : nextDouble(), ���ڿ� : nextLine()
		
		System.out.print("�̸� = ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.print("�������� = ");
		int kor = scan.nextInt();
		System.out.println("kor = " + (kor/2));
		
		System.out.print("����(�Ǽ�) = ");
		double math = scan.nextDouble(); // 95.23
		System.out.println("math = " + (math+100));
	}
}
