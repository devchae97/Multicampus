package basic01;

public class ExGuGuDan {

	public static void main(String[] args) {
		
		// 구구단 표 만들기
		
		System.out.println("\t구구단");
		for(int i=1; i<=7; i+=3) {
			for(int j=i; j<i+3; j++) {
				System.out.print("==" + j + "단==\t");
			}
			System.out.println();
			
			for(int x=2; x<10; x++) {
				for(int y=i; y<i+3; y++) {
					System.out.print(y + "*" + x + "=" + y*x + "\t");
				}
				System.out.println();
			}
		}
	}
}

