
public abstract class AbstractTest {
	
	// �߻�Ŭ������ �߻� �޼ҵ带 1�� �̻� ������ ��츦 ���Ѵ�
	// �߻�޼ҵ�� ��ȯ�� ���ʿ� abstract Ű���带 �ٿ����Ѵ�
	// �߻�Ŭ������ class ���ʿ� abstract Ű���带 �ٿ����Ѵ�
	
	int num = 20;
	String name = "������";
	AbstractTest(){}
	
	void setData(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	abstract void output(); // �̿ϼ� �޼ҵ� : �߻�޼ҵ�
	abstract void getName();
}