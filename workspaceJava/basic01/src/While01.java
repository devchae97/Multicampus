

public class While01 {

	public static void main(String[] args) {

//		while(���ǽ�) {
//			���๮;
//			:
//		}
		
		int i = 0;
		while(i<5) { // true�϶� ����
			i++;
			System.out.println(i); // 12345
		}
		
		int x=1;
		while (x<=5) { // ��
			int y=1;
			while (y<=7) { // ĭ
				System.out.print(y);
				y++;
			}
			System.out.println();
			x++;
		}
	}
}