

public class PrintfTest {

	public static void main(String[] args) {
		
		// printf() : ��� �� ���ڿ� �Ǵ� ���ڸ� �ڸ��� ������ ��� ����
		// inputStream Ŭ������ print(), println(), printf()
		// printf �� f�� format�� f
		
		// ����� : \", \', \t : tap, \n : �ٹٲ�
		// ���� �̸��� ä�����Դϴ�.
		// ���� �̸��� "ä����"�Դϴ�.
		System.out.println("���� �̸���\n\"ä����\"�Դϴ�.");
		
		int a = 125;
		double b = 235.2356485;
		String name = "ä����";
		
		//				 (pattern, ����)
		// decimal ������, ���� : %d, �Ǽ� : %f, ���ڿ� : %s, 1���� : %c
		
		System.out.printf("a������ ���� %-10d�Դϴ�.\n", a); // "a������ ���� 125       �Դϴ�."
		// -10d : (���ڸ���)�������� 10�ڸ�, printf�� �ڵ� �ٹٲ� X
		// 10d : (�������)�������� 10�ڸ�
		System.out.printf("%10.3f\n", b); // "   235.236"
		// �Ҽ��� ���� 10ĭ, �Ҽ��� �� 3�ڸ�
		System.out.printf("����\t�̸��� \"%5s\"�Դϴ�.\n", name ); // "����	�̸��� "  ä����"�Դϴ�." �̸����� 5ĭ
		System.out.printf("%5s\n", "ABC"); // "  ABC"
		System.out.printf("%4c\n", 'z'); // "   z"
		System.out.printf("a =%5d, b =%7.2f, name =%s",a,b,name); // "a =  125, b = 235.24, name =ä����"
	}
}
