import pac.Test;

public class ModifierTest {

	public static void main(String[] args) {
		// public > protected > default(����������) > private
		
		// public : ����
		// default : ���� ��Ű�� ���� �ִ� Ŭ�������� ������ ����Ѵ�
		
		Test t = new Test();
		// num�� default�̹Ƿ� �ٸ� ��Ű���� Ŭ�������� ���ٺҰ�
		// System.out.println(t.num); // ����
		System.out.println(t.name); // public �̹Ƿ� ����
		
		t.gugudan(8);
	}
}
