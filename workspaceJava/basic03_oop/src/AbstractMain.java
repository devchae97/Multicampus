
public class AbstractMain extends AbstractTest{
	
	// �߻�Ŭ������ �ݵ�� ��ӹ޾� �߻�޼ҵ带 �������̵��� ���
	
	AbstractMain(){}
	
	void output() {
		System.out.println("��ȣ = " + num);
		System.out.println("�̸� = " + name);
	}
	
	void getName() {}
	
	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		am.output();
	}
}
