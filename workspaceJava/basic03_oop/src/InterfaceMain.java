
public class InterfaceMain implements InterfaceTest, InterfaceBoard{

	// interface Ŭ������ Ȱ���ϱ� ���ؼ��� implements Ű����� �������̽��� ��ӹ޴´�
	// �������̽��� �������� ��ӹ��� �� �ִ�
	// �������̽����� �������̽��� ��ӹ������� extends Ű����� ����Ѵ� (1����)
	// ��ӹ��� ��� �߻�޼ҵ�� �������̵��� �Ǿ���Ѵ�
	
	public InterfaceMain() {}

	@Override
	public void list() {
		System.out.println("�� ����Ʈ ����");
		
	}

	@Override
	public void edit() {
		System.out.println("�� �����ϱ�");
		
	}

	@Override
	public void write() {
		System.out.println("�Խ��� �۾���");
		
	}

	@Override
	public void show() {
		System.out.println("�� ���뺸��");
		
	}

	@Override
	public int getName() {
		return MAX;
	}
	
	public static void main(String[] args) {
		InterfaceMain im = new InterfaceMain();
		im.write();
		System.out.println(im.getName());
		System.out.println(im.MAX);
		System.out.println(InterfaceTest.MAX);
	}
}
