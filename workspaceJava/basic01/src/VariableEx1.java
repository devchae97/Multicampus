

import java.util.Scanner;

public class VariableEx1 {

	public static void main(String[] args) {
		
		// �ٱ��Ͽ� ����� ���� ��� �ѹٱ��Ͽ��� ����� 10���� ���� �� �ִ�.
		// ����� 31���� �� �ٱ��� ���� ���϶�.

		/*
		int apple = 31; int basket = (apple%10==0) ? apple/10 : apple/10 + 1;
		System.out.println(basket); // 4
		*/

		// ����� �ٱ��� ���� �Է¹ޱ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ���� = ");
		int apple = scan.nextInt();
		System.out.print("�ٱ��� �뷮 = ");
		int basketSize = scan.nextInt();
		
		int basket = (apple%basketSize==0) ? apple/basketSize : apple/basketSize + 1;
		System.out.println("�ʿ��� �ٱ��� �� = " + basket);
	}
}
