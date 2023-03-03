

public class StringBufferTest {

	public static void main(String[] args) {
		
		// String : ������ ���� ������ ������(����ȭ) ����, immutable
		// StringBuffer : ������ ���� �����尡��, mutable
		// StringBuilder : ������ ���� ����ȭ�� ������� ���� ��
		
		// StringBuffer sb = new StringBuffer(30); // Buffer�� capacity ����
		StringBuffer sb = new StringBuffer("Java Programming Test...");
		//									012345678901234567890123	33
		sb.append("üũ��"); // append : �������� �߰�, sb = sb.append("üũ��"); a = a + "ddd";
		sb.insert(4, "(�ڹ�)"); // insert : index 4 �տ� "(�ڹ�)" ����
		
		System.out.println(sb); // Java(�ڹ�) Programming Test...üũ��
		
		sb.delete(5, 10); // delete : index 5 �ں��� 10 �ձ��� �����
		System.out.println(sb); // Java(rogramming Test...üũ��
		
		sb.reverse(); // reverse : �Ųٷ� ������
		System.out.println(sb); // ��ũü...tseT gnimmargor(avaJ
		
		// Ȯ���� �޸� Ȯ��
		System.out.println("capacity -> " + sb.capacity()); // 40
		
		StringBuffer first = new StringBuffer("Java");
		StringBuffer second = new StringBuffer("JAVA");
		
		// equals();
		// compareTo() : ���ڿ� ���ڸ� ���� ������ ����
		int result = first.compareTo(second); // "Java" - "JAVA", 32
		// ù ���� J�� �Ѵ� �빮�ڷ� ����, �ι�° a=97, A=65 �̹Ƿ� 97-65 = 32, ������ �������⿡ ���� va�� �Ű澲������
		int result2 = second.compareTo(first); // "JAVA" - "Java", -32
		// 0 : �� ��ü�� �����Ͱ� ����, ��� : ���� ��ü�� �����Ͱ� ŭ, ���� : ���� ��ü�� �����Ͱ� ����
		System.out.println("result : " + result + ", result2 : " + result2); // result : 32, result2 : -32
	}
}
