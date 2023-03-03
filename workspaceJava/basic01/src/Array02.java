

public class Array02 {
	
	public static void main(String[] args) {
		
		// 배열의 생성과 동시에 데이터 설정하기
		
		int data[] = new int[] {12,8,6,4,9,78};
		int data2[] = {52,12,25};
		String data3[] = {"가나다","라마바"};
		
		for(int i=0; i<data.length; i++) { // 0,1,2,3,4,5
			System.out.println("data[" + i +"]=" + data[i]);
		}
		
		for(int j=0; j<data2.length; j++) { // 0,1,2
			System.out.println("data2[" + j + "]=" + data2[j]);
		}
		
		for(int r=0; r<data3.length; r++) { // 0,1
			System.out.println("data2[" + r + "]=" + data3[r]);
		}
	}
}
