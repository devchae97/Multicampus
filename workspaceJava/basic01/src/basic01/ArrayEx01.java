package basic01;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//		IfElseIfEx01�� ������ �迭�� Ǯ���
//		
//		������
//		�������� = 80
//		�������� = 90
//		�������� = 80
//		���� = 250
//		��� = 83.3
		
		Scanner scan = new Scanner(System.in);
		
		// ������ �迭�� ����
		String title[] = {"����","����","����","��������","����"};
		int score[] = new int[title.length];
		
		// ���� �Է�
		for(int i=0; i<score.length; i++) {
			System.out.print(title[i] + "���� = ");
			score[i] = scan.nextInt();
		}
		
		// ����
		int tot = 0;
		for(int i=0; i<score.length; i++) {
			tot += score[i];
		}
		
		// ���
		int ave = tot / score.length;
		
		System.out.println("���� = " + tot + "\n��� = " + ave);
		
	}
}
