

public class For01 {
	
	public static void main(String[] args) {
		
		for(int i=3; i<=10; i+=3) { // 3���� 10���� 3�� ���ϱ�
			System.out.println(i); // 3 6 9
		}
		
		for(int i=3; i<=10; i++) { // 3���� 10���� 1�� ���ϱ�
			if(i%3==0) {
				System.out.println(i); // 3 6 9
			}
		}
		
		for(int i=10; i>=1; i--) { // 10���� 1���� 1�� ����
			System.out.println(i); // 10 9 8 7 6 5 4 3 2 1
		}
		
//		for(;;) { // ���ѹݺ�
//			System.out.println("������...");
//		}
	}
	
}