

public class Array04 {

	public static void main(String[] args) {
		
		// 2���� �迭 ����
		// ������ Ÿ���� ���� ���� �����ϱ�
		
		int data[][] = new int [4][3]; // 4�� 3��
		int[][] data2;
		
		data[2][1] = 60;
		data[1][0] = 80;
		
		System.out.println(data[2][1]);
		System.out.println("-----���м�-----");
		
		// data.length : 2���� �迭 ���� ��
		for(int i=0; i<data.length; i++) { // 0,1,2,3
			
			// data[i].length : 2���� �迭 ���� ��
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
			
//			0	0	0
//			80	0	0
//			0	60	0
//			0	0	0
			
		}
	}
}
