

import java.util.Scanner;

public class VariableEx3 {

	public static void main(String[] args) {
		
		// ���ÿ� ���� �簢���� ����, �簢���� �ѷ��� ���ϱ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� : 1. �簢���� ����, 2. �簢���� �ѷ� = ");
		int menu = s.nextInt();
		
		System.out.print("�簢���� ���α��� = ");
		int width = s.nextInt();
		
		System.out.print("�簢���� ���α��� = ");
		int height = s.nextInt();
		
		int result = (menu==1) ? width*height : 2 * (width + height);
		String rabel = (menu==1) ? "����" : "�ѷ�";
		System.out.println("�簢���� " + rabel + "�� = " + result);
		
	}
}
