package basic01;

public class Array06 {

	public static void main(String[] args) {
		
		// BubbleSort : �迭�� ���� ũ������� �����ϱ�
		
		int arr[] = {45,32,43,74,64,3,89,53,1,20};
		
		// ���� ��
		System.out.print("���� �� : ");
		for(int i=0; i<arr.length; i++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n-----���м�-----");
		
		for(int j=0; j<arr.length-1; j++) { // ����� �迭�� ũ�� -1 �� ����
			// ���尡 ����� �� ���� �ڿ��� �ϳ��� ����, �ѹ��� �ٿ����� ��
			// ����		   10-1-0, 10-1-1, 10-1-2, ...
			for(int i=0; i<arr.length-1-j; i++) { // ���� ū ���� �ǵڷ� ���⿡ �� �ڴ� �� ���ʿ�
				if(arr[i] > arr[i+1]) { // 0��° ���� 1��° ���� ���� 0��° ���� �� ũ�� ��ȯ
				// < ���ϸ� �������� ����, > �� �ϸ� �������� ����
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
			}
			System.out.print("���� �� : ");
			for(int i=0; i<arr.length; i++) { // 0,1,2,3,4,5,6,7,8,9
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
	}
}
