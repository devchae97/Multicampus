import java.util.Scanner;

public class ClassTest {

	// class ���� : ����� ����, ������� �������(��������)
	int num = 1234;
	final int MAX = 100; // ���ȭ�� ���� : �� ���� �Ұ�, �������� ��� �빮�� ex) Math.PI, Calendar.YEAR, ...
	
	Scanner scan = new Scanner(System.in);
	
	// ������ �޼ҵ� : ��ü�� �����ϴ� ���
	// ��Ģ : �޼ҵ���� �ݵ�� Ŭ������� ��ġ
	// 		 ��ü ���� �� �ѹ� ���� (��ü ������ �� �ʱ�ȯ���� ����� �� �� �ִ�.)
	// 		 ��ȯ���� ����.
	ClassTest(){
		// ���๮�� ���� ��. ����, ����, if, for, while, �迭, ...
		System.out.println("ClassTest() ������ �޼ҵ�");
	}
	
	ClassTest(int num){
		this.num = num; // this : ���� Ŭ����
		System.out.println("ClassTest(int) ������ �޼ҵ�");
	}
	
	ClassTest(String name, int num) {
		System.out.println("�̸� = " + name + ", ���� = " + num);
	}
	ClassTest(int num, String name){
		// ������ �޼ҵ忡�� �ٸ� ������ �޼ҵ� �����ϱ�
		// ù��° ���� ���๮�̿��� ��
		this(name, num);
		System.out.println("name num");
	}
	
	// �޼ҵ� : ��ɱ���
	// 		   �ҹ��ڷ� ����
	//		   ��ȯ���� �������� �������� ����. ��ȯ�� ���� ��� void
	//		   �Ű������� �������� �Ǵ� ������ �޶�� ��
	// ���� : ��ȯ�� �޼ҵ��(�Ű�����){���๮;}
	
	void sum() { // 1~100������ ���� ���ϴ� ����� �ִ� �޼ҵ�
		int tot = 0;
		for(int i=0; i<=100; i++) {
			tot += 1;
		}
		System.out.println("1~100������ ���� " + tot);
	}
	
	String total(int a) {
		System.out.println("���� �Է�");
		a = scan.nextInt();
		int tot = 0;
		for(int i=1; i<=a; i++) {
			tot += i;
		}
		return "1~" + a + "������ ���� -> " + tot;
	}
	
	
}
