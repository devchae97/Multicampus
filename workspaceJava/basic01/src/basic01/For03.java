package basic01;

public class For03 {
	
	public static void main(String[] args) {
		
		// break : �ݺ����� ������ ����
		
		for(int i=1;;i++) {
			System.out.println(i); // 1,2,3,4,5,6,7,8,9,10
			if(i>=10) {
				break;
			}
		}
		
		// continue : �ݺ��� ���� ���๮�� �ѹ� �ǳʶٱ�
		
		for(int i=1;i<=100;i++) {
			if(i>=10) {
				continue;
			}
			System.out.println(i); // 1,2,3,4,5,6,7,8,9
			
		}
	}
}
