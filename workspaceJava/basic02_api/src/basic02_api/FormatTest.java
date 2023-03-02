package basic02_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {
		
		// ����(int)�� ���ڿ��� �����
		int won = 5475483;
		
		// won�� ���� ȭ������� �����
		DecimalFormat fmt = new DecimalFormat("###,###��");
		String wonResult = fmt.format(won);
		System.out.println(wonResult); // 5,475,483 ��
		
		// ���ڵ����͸� ���ڷ� �ٲٱ�
		try {
			NumberFormat nf = NumberFormat.getInstance();
			Number n = nf.parse(wonResult);
			int result = n.intValue(); // Integer ��ü���� int�� ���� �̾Ƴ��� �޼ҵ�
			System.out.println(result);
		}catch(ParseException pe) {
			System.out.println(pe.getMessage());
		}
		
		// ��¥ ����
		Calendar now = Calendar.getInstance();
		
		SimpleDateFormat datefmt = new SimpleDateFormat ("yyyy-MM-dd(E) hh:mm:ss a");
		String dateTxt = datefmt.format(now.getTime());
		System.out.println(dateTxt); // 2023-03-02(��) 12:34:14 ����
		
		// �̸� : �达��, ����ó : 010-1234-5678, �ּ� : ����� ������ ���ﵿ
		String name = "ȫ�浿";
		String tel = "010-1234-5678";
		String addr = "����� ������ ���ﵿ";
		// print(), println(), printf()
		
		// static String	format(String pattern, Object ... arguments)
		String msg = MessageFormat.format("�̸� : {0}\n����ó : {1}\n�ּ� : {2}", name, tel, addr);
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		new FormatTest();
	}
}
