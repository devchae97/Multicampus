

public class For04 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){ // 1���� 5���� 1�� ����
			for(int j=1; j<=3; j++) { // 1���� 3���� 1�� ����
				System.out.print(j); // 123 123 123 123 123
				// System.out.print(i); // 111 222 333 444 555
				// System.out.print("*"); // *** *** *** *** ***
			}
			System.out.println();
		}
		
//		1
//		12
//		123
//		1234
//		12345
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		12345
//		1234
//		123
//		12
//		1
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//			*
//		   **
//		  ***
//		 ****
//		*****
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int s=1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int s=1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}