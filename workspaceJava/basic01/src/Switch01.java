

public class Switch01 {
	
	public static void main(String[] args) {
		// 1 -> 해바라기
		// 2 -> 코스모스
		// 3 -> 장미
		
		int inData = 1;
		String flowerName = "";
		
		switch(inData) {
		case 1:
			flowerName = "해바라기";
			break;
		case 2:
			flowerName = "코스모스";
			break;
		case 3:
			flowerName = "장미";
			break;
		default :
			flowerName = "없는 꽃";
		}
		
		System.out.printf("%d는 %s입니다.", inData, flowerName); // printf 정수, 문자열
	}
}
