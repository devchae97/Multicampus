package basic01;

import java.util.Scanner;

public class IfElseEx01 {
	
	public static void main(String[] args) {
		
//		������
//		���ϴ� �޴����� (1.�簢���� ����, 2.���� ����) ? 1
//		�غ�=5
//		����=6
//		�簢���� ����=30
//		
//		���ϴ� �޴����� (1.�簢���� ����, 2.���� ����) ? 2
//		������=5
//		���� ����=
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� �޴����� (1.�簢���� ����, 2.���� ����) ?");
		int menu = scan.nextInt();
		if (menu==1) {
			System.out.print("�غ� = ");
			int w = scan.nextInt();
			System.out.print("���� = ");
			int h = scan.nextInt();
			
			int result1 = w*h;
			System.out.println("�簢���� ���� = " + result1);
		}else {
			System.out.print("������ = ");
			int r = scan.nextInt();
			
			double result2 = r*r*Math.PI; // PI
			System.out.println("Math.PI = " + Math.PI);
			System.out.println("���� ���� = " + result2);
		}
	}
}
