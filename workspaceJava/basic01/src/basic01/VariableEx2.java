package basic01;

import java.util.Scanner;

public class VariableEx2 {
	
	public static void main(String[] args) {
		
		// ������ ������ �Է¹޾� 1~100 ������ ���̸� �Է¹��� ���� 100�� ���Ͽ� ����ϰ� �� ���� ���� 0�� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� = ");
		int num = scan.nextInt();
		int result = (num>=1 && num<=100) ? num*100 : 0;
		System.out.println("��°� = " + result);
	}
}
