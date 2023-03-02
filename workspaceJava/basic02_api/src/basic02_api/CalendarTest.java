package basic02_api;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		// Calendar Ŭ������ new�� ��ü ������ �Ұ���, getInstance() �޼ҵ带 �̿��� ��ü ���ϱ�
		
		Calendar now = Calendar.getInstance(); // ���� ��¥ + �ð� ���� ����
		
		// ��¥ �����ϱ�
//		now.set(2023, 5, 12);
//		now.set(2022, 10, 2, 10, 25);
//		now.set(2022, 0, 13, 12, 00, 00);
		now.set(Calendar.YEAR, 2022);
		
		// Calendar ��ü���� ��¥ �Ǵ� �ð����� ������
		// 2023-03-02(ȭ) 16:20
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0 -> 1��, 1 -> 2��, 3 -> 4��, ...
		int day = now.get(Calendar.DATE); // = DAY_OF_MONTH
		int week = now.get(Calendar.DAY_OF_WEEK); // 1:��, 2:��, 3:ȭ, ...
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String weekName = "";
		switch(week) {
		case 1 : weekName = "��"; break;
		case 2 : weekName = "��"; break;
		case 3 : weekName = "ȭ"; break;
		case 4 : weekName = "��"; break;
		case 5 : weekName = "��"; break;
		case 6 : weekName = "��"; break;
		case 7 : weekName = "��"; break;
		}
		
		System.out.printf("%d-%d-%d (%s) %d:%d:%d\n", year, month, day, weekName, hour, minute, second);
		System.out.println(now);
	}
}
