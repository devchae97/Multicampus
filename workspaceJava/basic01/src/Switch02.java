

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		
//		���� �Է¹޾� ��, ����, ����, �ܿ��� ������ ����ϴ� ���α׷��� �ۼ��ϱ�
//		
//	 	�� : 3, 4, 5
//	 	���� : 6, 7, 8
//	 	���� : 9, 10, 11
//	 	�ܿ� : 12, 1, 2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է� = ");
		int month = scan.nextInt();
		String season = "";
		
		if (month>=1 && month<=12) {
			switch(month) {
			case 3:
			case 4:
			case 5:
				season = "��";
				break;
			case 6:
			case 7:
			case 8:
				season = "����";
				break;
			case 9:
			case 10:
			case 11:
				season = "����";
				break;
			default :
				season = "�ܿ�";
			}
		System.out.printf("%d���� %s", month, season);		
		}else {
			System.out.println("���� �ƴմϴ�.");
		}
		
	}
}
