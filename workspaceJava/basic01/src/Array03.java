

public class Array03 {
	
	public static void main (String[] args) {
		
		// �迭�� ����
		// �迭�� ���� �� ũ�� ���� �Ұ�
		
		int arr[] = {60,80,61,85,95,34,26,94};
		
		int arr2[] = new int [10];
		
		System.arraycopy(arr, 1, arr2, 2, 4); // arr�� 1�� �ε����� arr2�� 2�� �ε����� 4�� ����
		
		for(int i=0; i<arr2.length; i++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.print(arr2[i]+"\t"); // 0 0 80 61 85 95 0 0 0 0
		}
		
		System.out.println();
		
		System.arraycopy(arr, 0, arr2, 0, 8); // arr�� 0�� �ε����� arr2�� 0�� �ε����� 8�� ����
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t"); // 60 80 61 85 95 34 26 94 0 0
		}
	}
}
