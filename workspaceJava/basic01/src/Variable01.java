

public class Variable01 { // ������� = �������� (�޼ҵ� ���� ����)
	
	public static void main (String[] args) { // �������� (�޼ҵ� ���� ����)
		
		/* ���� ���� ��Ģ
		 * 1. �ҹ���, _, $ �� ����
		 * 2. �� ��ҹ���, _, $, ���ڸ� ��� (Ư������ ��� �Ұ�)
		 * 3. �ռ����� ��� �� ��° �ܾ���� ù��° ���ڴ� �빮�� ex) homeworkJava
		 * 4. ������ ���̴� 256���ڱ��� ���
		 */
		
		byte kor = 80;
		int eng = 90;
		short mat = 75;
		
		// type casting : ����ȯ
		short total = (short)(kor + eng + mat);
		
		System.out.println("����������" + kor);
		System.out.println("����������" + eng);
		System.out.println("����������" + mat);
		System.out.println("������" + total);
		
	}
}
