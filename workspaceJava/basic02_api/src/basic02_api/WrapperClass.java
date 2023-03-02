package basic02_api;

public class WrapperClass {

	public WrapperClass() {
		int i = 500;
		// Wrapper Ŭ����
		// Byte, Short, Integer, Long
		// Float, Double
		// Character
		
		// i�� ��ü�� �����
		Integer intObj = Integer.valueOf(i);
		
		System.out.println(intObj.MAX_VALUE); // 2147483647, Integer.BYTES
		System.out.println(intObj.MIN_VALUE); // -2147483648
		
		Integer intObj2 = i; // �⺻���������� ��üȭ, ����ڽ�
		int con = intObj; // Wrapper Ŭ�������� �⺻������������ ��ȯ, �����ڽ�
		
		String data = "254";
		// ���ڿ��� ���ڷ� ����
		Integer y = new Integer(data); // new Integer(i) : �������� �ʴ� �ǹ̷� ��Ҽ� �߻�
		int z1 = Integer.parseInt(data); // int, parseInt() : ���ڿ����� ���ڸ� ����
		Integer z2 = Integer.valueOf(data); // Integer
		int z3 = Integer.valueOf(data); // Integer
		System.out.println(z1*2); // 508
		System.out.println(z2*3); // 762
		
	}
	
	public static void main(String[] args) {
		new WrapperClass();
	}
}
