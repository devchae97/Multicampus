package basic01;

import java.util.Scanner;

public class ForEx04 {
	
	public static void main(String[] args) {
		
//		1���� n������ ���� �Է¹��� ������ ������ ũ�ų� ��������
//		������
//		������ �� = 25326
//		1~____������ ���� 25425
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �� = ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=1;;i++) {
			sum += i;
			if (sum>=num) {
				System.out.printf("1~%d������ ���� %d\n", i, sum);
				break;
			}
		}
	}
}