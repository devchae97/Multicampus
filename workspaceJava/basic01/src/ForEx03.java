

import java.util.Scanner;

public class ForEx03 {
	
	public static void main(String[] args) {
		
//		����
//		������ ���� = 100
//		1~100������ ���� 5050
//		1~100������ Ȧ���� ���� 2500
//		1~100������ ¦���� ���� 2550
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ���� = ");
		int max = scan.nextInt();

		int sum=0, oddSum=0, evenSum=0;
		
		for(int i=1; i<=max; i++) {
			if (i%2==0) { // ¦��
				evenSum +=i;
			}else { // Ȧ��
				oddSum += i;
			}
		}
		sum = evenSum + oddSum;

		System.out.println("1~"+max+"������ ���� "+sum);
		System.out.println("1~"+max+"������ Ȧ���� ���� "+oddSum);
		System.out.println("1~"+max+"������ ¦���� ���� "+evenSum);
	}
}
