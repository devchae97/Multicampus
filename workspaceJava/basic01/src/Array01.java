

public class Array01 {
	
	public static void main(String[] args) {
		
//		�迭�� �����ϱ�
//		���� : 0, �Ǽ� : 0.0, �� : false, char : , String : null
		
		int kor[] = new int[10]; // 0
		int[] eng;
		eng = new int[5]; // 0
		
		int[] mat; // null
		String[] name = new String[10];
		System.out.println(kor); // [I@5e91993f 10ĭ¥�� �迭 �����ּ�, ([�迭, Interger type, @������, �ּҰ�)
		// System.out.println(mat); // NullpotinerException �߻�
		System.out.println(name); // [Ljava.lang.String;@1c4af82c
		
		System.out.println("-----���м�-----");
		
		// �迭�� �����ϱ�
		kor[2] = 85;
		kor[6] = 90;
		name[1] = "������";
		
		// �迭�� ũ�� : kor.length
		for(int idx=0; idx<kor.length; idx++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.println("kor [" + idx + "] = " + kor[idx]); // 2�� 6 �ܴ� 0
		}
		for(int i=0; i<name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]); // 1 �ܴ� null
		}
	}
}
