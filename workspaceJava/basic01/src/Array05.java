

public class Array05 {

	public static void main(String[] args) {
		
		// 2���� �迭�� �ʱⰪ �����ϱ�
		int score[][] = new int[][] {{8,9,3},
									 {90,73,81},
									 {50,9,80}};
		int data [][] = {{90,50,60},
				 		 {50,50,60},
				 		 {90,80,70},
				 		 {80,90,50},
						 {70,80,70}};
		 
		 String title[] = {"����","����","����","����","���"};
		 
		 // Ȯ��� �ݺ���
		 // ������ Ÿ�� ���� : �迭, �÷���
		 
		 // ���� for��
		 // ��ü�� ��ü�� �����͸� ���� ������ ���� ����θ� ����
		 // ������ ó������ ������ �ݺ�����
		 for(String t : title) { // title���� ���ʴ�� ��ü�� ���� A�� �ְڴ�, title���� ���� ��ü�� ����������
			 System.out.print(t + "\t"); // ���� ���� ���� ���� ���
		 }
		 System.out.println();
		 
		for(int i=0; i<data.length; i++) { // 0,1,2,3,4
			
			int sum = 0;
			for(int j=0; j<data[i].length; j++) { // 0,1,2
				System.out.print(data[i][j]+"\t"); 
				sum += data[i][j];
			}
			
			int ave = sum / data[i].length;
			System.out.print(sum + "\t" + ave);
			System.out.println();
		}
	}
}
