
public class StaticTest {

	// static�� �������, �޼ҵ忡 ǥ�Ⱑ��
	// ������Ÿ�� ���ʿ� ���
	// ��ü��.�������
	// Ŭ������.�������
	
	String name = "��¯��";
	int age = 10;
	static String addr = "������";
	
	// ����������� ���๮ ǥ�� �Ұ�
	// static�� �̿��ϸ� ��������� ���๮ ��� ����
	// ���� Ŭ������ ��ü�� ������ �����ϴ��� �ѹ��� ����
	
	static {
		System.out.println("���๮");
		System.out.println("������� ���Ұ�");
		
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	StaticTest(){
		System.out.println("�����ڸ޼ҵ�");
	}
	
	void setData(String name) {
		this.name = name;
	}
	
	// �޼ҵ忡 static
	// ��ü�� �������� �ʰ� �ܺο��� Ŭ������.�޼ҵ������ ������ ����
	
	static void setAddr(String addr) {
		StaticTest.addr = addr;
	}
}
