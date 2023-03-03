

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		
		// Arrays 클래스 : 배열을 이용해 처리
		int data [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		
		// toString() : 객체의 값을 문자열로 만들어 리턴, 배열 적용 가능
		String lst = Arrays.toString(data);
		System.out.println(lst); // [85, 24, 76, 52, 14, 4, 43, 1, 32]
		System.out.println(Arrays.toString(data)); // 위와 동일
		
		// 오름차순 정렬
		// Arrays.sort(data); // 1 4 14 24 32 43 52 76 85
		// Arrays.sort(data,2,6); // index 2부터 6 앞까지 85 24 (4 14 52 76 43) 1 32

		// 내림차순 정렬
		Integer data2 [] = {85, 24, 76, 52, 14, 4, 43, 1, 32};
		// Integer : int의 Wrapper Class, 기본형을 객체로 다루기 위해 사용
		Arrays.sort(data2, Collections.reverseOrder());
		System.out.println("정렬 후 -> " + Arrays.toString(data2)); // [85, 76, 52, 43, 32, 24, 14, 4, 1]
		
		// 배열의 복사
		int copy [] = Arrays.copyOfRange(data, 2, 6); // index 2부터 6 앞까지
		System.out.println("copy -> " + Arrays.toString(copy)); // [76, 52, 14, 4]
		
		// 배열의 비교
		int data3 [] = {85, 24, 76, 52, 14, 4, 43, 32, 1}; // 제일 뒤 두개만 변경
		System.out.println(Arrays.equals(data, data3)); // false
	}
}
