package basic01;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� = ");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("�Է°��� ���");
		}else if(num<0) {
			System.out.println("�Է°��� ����");
		}else {
			System.out.println("�Է°��� 0");
		}
	}
}
