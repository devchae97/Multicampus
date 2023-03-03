

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		// 이메일을 입력받아 아이디와 도메인 구분하기
//		실행
//		이메일 = abcde@naver.com
//		아이디 = abcde
//		도메인 = naver.com
//		계속하려면 Y, 그만두려면 N
//		
//		이메일 = addd.@com
//		addd.@com은 잘못된 메일 형식입니다.
//		계속하려면 Y, 그만두려면 N
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("이메일 = ");
			String email = scan.nextLine();
			
			// indexOf() : 특정 문자나 문자열에서 해당하는 문자의 인덱스 값을 반환, 없을경우 -1 반환
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			// 조건부여 : 아이디 최소 3자, 아이디에 .불가, 도메인 길이 최소 3자
			if(atMark<3 || point<atMark || Math.abs(atMark-point) <= 2) { // 잘못된 메일 형식
				System.out.println(email + "은 잘못된 메일 형식입니다.");
			}else { // 정상 메일 형식
				// split(), substring(), StringTokenizer
				
				// 1. split() 사용 : 입력받은 특정값 기준으로 문자열을 나눠 배열에 저장해 리턴
//				String emailSplit[] = email.split("@");
//				System.out.println("아이디 = " + emailSplit[0]);
//				System.out.println("도메인 = " + emailSplit[1]);
				
				// 2. substring() 사용 : 입력받은 인자값을 index로 해당 위치 포함 이후 모든 문자열 리턴
				//		인자값이 하나인 경우 : substring(5) : 0~4까지 제외, 5부터 끝까지
				//		인자값이 둘인 경우 : substring(6,12) : 6~11까지, 시작부분과 끝 부분 지정
//				String id = email.substring(0, atMark);
//				String domain = email.substring(atMark+1);
//				System.out.println("아이디 = " + id);
//				System.out.println("도메인 = " + domain);
				
				// 3. StringTokenizer 사용 : 하나의 문자열을 여러개의 토큰으로 분리하는 클래스, default:false(구분자는 토큰에 포함X)
				StringTokenizer emailobj = new StringTokenizer(email, "@"); // email 문자열을 구분자@ 기준 분리
				String id = emailobj.nextToken();
				String domain = emailobj.nextToken();
				System.out.println("아이디 = " + id);
				System.out.println("도메인 = " + domain);
			}
			System.out.println("계속하려면 Y, 그만두려면 N");
			if(!scan.nextLine().equalsIgnoreCase("Y")) { // equalsIgnoreCase : 대소문자 구분안함, equals : 대소문자 구분
				System.out.println("프로그램 종료");
				break;
			}
		}while(true);
	}
}
