

import java.util.Scanner;

public class IfElse01 {
	
	public static void main(String[] args) {
		
		// ���๮�� �� ���� ��� �߰�ȣ ����, ���� �ٿ����� ����
		
		int a = 50;
		if(a>100) System.out.println(a); // ���ǹ� false�̹Ƿ� �̽���
		
		//--------------------------------------------------
		
		// ������ ������ �Է¹޾� 1~100 ������ ���̸� ���� ����ϰ� �� ���� ���� ����� ����� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� = ");
		int num = scan.nextInt();
		
		if(num>=1 && num<=100) {
			System.out.println("num = " + num);
		}else {
			num = Math.abs(num); // ���밪 ���ϱ�
			System.out.println("num = " + num);
		}
		
	}
}
