package innerClass;
// ����Ŭ������ Ŭ���� ���� Ŭ����
// 1. Ŭ������ ��������� ����Ŭ���� �����
// 2. �޼ҵ� �� ����Ŭ���� �����
// 3. �͸��� ����Ŭ���� ����� : �޼ҵ� ���� ����

public class OuterClass {

	String name = "��¯��";
	int age = 10;
	
	public OuterClass() {
		// �ܺ�Ŭ�������� ����Ŭ������ �������, �޼ҵ忡 ������ �Ұ���
		// System.out.println(addr); // ����
		// ����Ŭ�������� �ܺ�Ŭ������ �������, �޼ҵ忡 ���� ����
	}
	
	public void output() {
		System.out.println("�̸� = " + name);
	}
	
	// ����Ŭ����
	class InnerClass {
		String addr = "���ʱ� ���ʵ�";
		InnerClass(){
			output();
		}
		
		void memberOutput() {
			System.out.println("�ּ� = " + addr);
			System.out.println("�̸� = " + name + ", ���� = " + age);
		}
	}
	
	//--------------------------------------------------
	
	public static void main(String[] args) {
		// ����Ŭ������ ����ϱ� ���ؼ��� �ܺ�Ŭ������ ��ü �����Ǿ�� ��
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.memberOutput();
		// ����Ŭ���� ��ü���� �ܺ�Ŭ������ ����, �޼ҵ�� ȣ��Ұ�
		// ic.output(); // ����
		// oc.output();
		
		// 2. ��ü�������
		OuterClass.InnerClass ic2 = new OuterClass().new InnerClass();
		ic2.memberOutput();
	}
}
