

import java.util.Scanner;

public class IfEx01 {
	
	public static void main(String[] args) {
		
//		�Է¹��� �ݾ��� 10000 �̻��� ��� �������ڸ����� 0���� �ٲ㼭 ����ϱ�
//		
//		����
//		�ݾ��Է� = 26315
//		��� = 26310
//
//		�ݾ��Է� = 568259
//		��� = 568250
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݾ� �Է� = ");
		int num = scan.nextInt();
		
		if(num>=10000) {
			int result = num/10*10;
			System.out.print("��� = " + result);
		}
		
		

	}
}
