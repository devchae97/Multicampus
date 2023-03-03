import java.util.Scanner;

public class ExceptionTest2 {

	Scanner scan = new Scanner(System.in);
	
	public ExceptionTest2() {
		start();
	}
	
	public void start() {
		try {
			System.out.print("첫번째 정수 = ");
			int first = scan.nextInt(); // InputMismatchException
			System.out.print("두번째 정수 = ");
			int second = scan.nextInt();
			System.out.printf("first = %d, second = %d\n", first, second);
			
			int result = first / second; // 어떤 수를 0으로 나눌 수 없음, ArithmeticException
			System.out.println(first + "/" + second + "=" + result);
			
			int data[] = {7,9,2,4,8,5};
			for(int i=0; i<=data.length; i++) { // ArrayIndexOutOfBoundsException
				System.out.println("data [" + i + "] = " + data[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열의 인덱스를 잘못 사용함");
		}catch(Exception e) { // Exception은 catch문 제일 아래 기재
			System.out.println("숫자 재입력");
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		new ExceptionTest2();
	}
}
