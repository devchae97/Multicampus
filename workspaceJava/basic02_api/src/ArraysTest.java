

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		
		// Arrays Ŭ���� : �迭�� �̿��� ó��
		int data [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		
		// toString() : ��ü�� ���� ���ڿ��� ����� ����, �迭 ���� ����
		String lst = Arrays.toString(data);
		System.out.println(lst); // [85, 24, 76, 52, 14, 4, 43, 1, 32]
		System.out.println(Arrays.toString(data)); // ���� ����
		
		// �������� ����
		// Arrays.sort(data); // 1 4 14 24 32 43 52 76 85
		// Arrays.sort(data,2,6); // index 2���� 6 �ձ��� 85 24 (4 14 52 76 43) 1 32

		// �������� ����
		Integer data2 [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		// Integer : int�� Wrapper Class, �⺻���� ��ü�� �ٷ�� ���� ���
		Arrays.sort(data2, Collections.reverseOrder());
		System.out.println("���� �� -> " + Arrays.toString(data2)); // [85, 76, 52, 43, 32, 24, 14, 4, 1]
		
		// �迭�� ����
		int copy [] = Arrays.copyOfRange(data, 2, 6); // index 2���� 6 �ձ���
		System.out.println("copy -> " + Arrays.toString(copy)); // [76, 52, 14, 4]
		
		// �迭�� ��
		int data3 [] = {85, 24, 76, 52, 14, 4, 43, 32, 1}; // ���� �� �ΰ��� ����
		System.out.println(Arrays.equals(data, data3)); // false
	}
}
