

import java.util.Scanner;
import java.util.StringTokenizer;

public class EmailCheckEx {

	public static void main(String[] args) {
		
		// �̸����� �Է¹޾� ���̵�� ������ �����ϱ�
//		����
//		�̸��� = abcde@naver.com
//		���̵� = abcde
//		������ = naver.com
//		����Ϸ��� Y, �׸��η��� N
//		
//		�̸��� = addd.@com
//		addd.@com�� �߸��� ���� �����Դϴ�.
//		����Ϸ��� Y, �׸��η��� N
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�̸��� = ");
			String email = scan.nextLine();
			
			// indexOf() : Ư�� ���ڳ� ���ڿ����� �ش��ϴ� ������ �ε��� ���� ��ȯ, ������� -1 ��ȯ
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			// ���Ǻο� : ���̵� �ּ� 3��, ���̵� .�Ұ�, ������ ���� �ּ� 3��
			if(atMark<3 || point<atMark || Math.abs(atMark-point) <= 2) { // �߸��� ���� ����
				System.out.println(email + "�� �߸��� ���� �����Դϴ�.");
			}else { // ���� ���� ����
				// split(), substring(), StringTokenizer
				
				// 1. split() ��� : �Է¹��� Ư���� �������� ���ڿ��� ���� �迭�� ������ ����
//				String emailSplit[] = email.split("@");
//				System.out.println("���̵� = " + emailSplit[0]);
//				System.out.println("������ = " + emailSplit[1]);
				
				// 2. substring() ��� : �Է¹��� ���ڰ��� index�� �ش� ��ġ ���� ���� ��� ���ڿ� ����
				//		���ڰ��� �ϳ��� ��� : substring(5) : 0~4���� ����, 5���� ������
				//		���ڰ��� ���� ��� : substring(6,12) : 6~11����, ���ۺκа� �� �κ� ����
//				String id = email.substring(0, atMark);
//				String domain = email.substring(atMark+1);
//				System.out.println("���̵� = " + id);
//				System.out.println("������ = " + domain);
				
				// 3. StringTokenizer ��� : �ϳ��� ���ڿ��� �������� ��ū���� �и��ϴ� Ŭ����, default:false(�����ڴ� ��ū�� ����X)
				StringTokenizer emailobj = new StringTokenizer(email, "@"); // email ���ڿ��� ������@ ���� �и�
				String id = emailobj.nextToken();
				String domain = emailobj.nextToken();
				System.out.println("���̵� = " + id);
				System.out.println("������ = " + domain);
			}
			System.out.println("����Ϸ��� Y, �׸��η��� N");
			if(!scan.nextLine().equalsIgnoreCase("Y")) { // equalsIgnoreCase : ��ҹ��� ���о���, equals : ��ҹ��� ����
				System.out.println("���α׷� ����");
				break;
			}
		}while(true);
	}
}
