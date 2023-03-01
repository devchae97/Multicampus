package basic01;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("정수 = ");
		int max = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=max; i++) { // 1,2,3,4,5,...,max
			sum += i; // sum = sum + i; sum의 값 누적
		}
		
		System.out.printf("1~%d까지의 합은 %d입니다.\n", max , sum);
	}
}
