

public class Array01 {
	
	public static void main(String[] args) {
		
//		배열을 선언하기
//		정수 : 0, 실수 : 0.0, 논리 : false, char : , String : null
		
		int kor[] = new int[10]; // 0
		int[] eng;
		eng = new int[5]; // 0
		
		int[] mat; // null
		String[] name = new String[10];
		System.out.println(kor); // [I@5e91993f 10칸짜리 배열 시작주소, ([배열, Interger type, @구분점, 주소값)
		// System.out.println(mat); // NullpotinerException 발생
		System.out.println(name); // [Ljava.lang.String;@1c4af82c
		
		System.out.println("-----구분선-----");
		
		// 배열에 접근하기
		kor[2] = 85;
		kor[6] = 90;
		name[1] = "가나다";
		
		// 배열의 크기 : kor.length
		for(int idx=0; idx<kor.length; idx++) { // 0,1,2,3,4,5,6,7,8,9
			System.out.println("kor [" + idx + "] = " + kor[idx]); // 2와 6 외는 0
		}
		for(int i=0; i<name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]); // 1 외는 null
		}
	}
}
