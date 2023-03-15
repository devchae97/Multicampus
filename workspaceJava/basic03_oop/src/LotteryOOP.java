import java.util.Random;
import java.util.Scanner;

public class LotteryOOP {

	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	int lottery [] = new int [7];
	
	LotteryOOP() {
		
	}
	
	// 게임수 입력
	int inData(String msg) {
		System.out.print(msg + "게임 수 = ");
		return scan.nextInt();
	}
	
	// 답변 입력
	int inData2(String msg) {
		System.out.println("계속하시겠습니까? (1.예, 2.아니오)");
		return scan.nextInt();
	}
}
