

public class Variable02 {

	public static void main(String[] args) {
		// char : 2byte
		
		char a = 'A';
		
		String grade = "A"; // grade++ ���� �� ����
		
		char b = ' '; // String�� �޸� ��('') �ֱ� �Ұ�
		
		a++;
		System.out.println(a); // B
		++a;
		System.out.println(a); // C
		
		a = (char)(a + 1); // char + int
		System.out.println(a); // D
		
		int c = a + 1;
		System.out.println(c); // 69 (�ƽ�Ű�ڵ� E=69)
	}
}
