package basic02_api;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "ä����";
		String name2 = "ä����";
		String addr = new String("����� ���ʱ� ���ʵ�");
		String addr2 = new String("����� ���ʱ� ���ʵ�");
		
		// == : ���ϰ��� �ϴ� �� �� ����� �ּҰ��� ��
		if(name==name2) {
			System.out.println("name�� name2�� �����ϴ�.");
		}else {
			System.out.println("name�� name2�� �ٸ���.");
		}
		// �����ϴ�.
		
		if(addr==addr2) {
			System.out.println("addr�� addr2�� �����ϴ�.");
		}else {
			System.out.println("addr�� addr2�� �ٸ���.");
		}
		// �ٸ���., ��ü�� �ּҰ� ���� �ٸ���.
		
		String addr3 = addr2;
		if(addr2==addr3) {
			System.out.println("addr2�� addr3�� �����ϴ�.");
		}else {
			System.out.println("addr2�� addr3�� �ٸ���.");
		}
		// �����ϴ�. ��ü�� �ּҰ� ���� ����.
		
		//--------------------------------------------------
		
		// equals() : ��ü���� ���� �� (��ҹ��� ����)
		String addr4 = new String("����� ���ʱ� ���ʵ�(dong)");
		String addr5 = new String("����� ���ʱ� ���ʵ�(Dong)");
		boolean boo = addr5.equals(addr4); // = addr4.equals(addr5)
		
		if(boo) {
			System.out.println("addr4 �� addr5�� �����ϴ�.");
		}else {
			System.out.println("addr4 �� addr5�� �ٸ���.");
		}
		// addr4 �� addr5�� �ٸ���. ��ҹ��ڰ� �ٸ���.
		
		// equalsIgnoreCase() : ���� �����ش�. (��ҹ��� ���� X)
		if(addr4.equalsIgnoreCase(addr5)) {
			System.out.println(("�����ϴ�. (��ҹ��� ����X)"));
		}else {
			System.out.println("�ٸ���. (��ҹ��� ����O)");
		}
		// �����ϴ�. (��ҹ��� ����X)
		
		//--------------------------------------------------
		
		String str = "A";
		str = str + "B";
		String str2 = str + 100;
		
		System.out.println("charAt() -> " + addr4.charAt(5)); // ��, index ��ġ�� ���ڸ� ��ȯ
		System.out.println("concat() -> " + addr4.concat(name)); // ����� ���ʱ� ���ʵ�(dong)ä����, ���ڿ���
		addr4 = addr4.concat(name);
		System.out.println("concat() -> " + addr4.concat(name)); // ����� ���ʱ� ���ʵ�(dong)ä����ä����
		
		String txt = "Hello!";
		byte txtCode[] = txt.getBytes(); // getBytes() : ���ڿ��� ���ڵ��� Byte���·� �Ѱ��ش�. default charset
		System.out.println(Arrays.toString(txtCode)); // [72, 101, 108, 108, 111, 33]
		// �ƽ�Ű�ڵ� H:72, e:101, l:108, o:111, !:33
		
		int idx = addr4.indexOf("��"); // ����� ���ʱ� ���ʵ�(dong)ä����
		System.out.println("indexOf -> " + idx); // 0
		System.out.println("lastIndexOf -> " + addr4.lastIndexOf("��")); // 8
		System.out.println("indexOf -> " + addr4.indexOf("��",5)); // 8, index5 ���ķ� ���� ã�ƶ�
		System.out.println("indexOf -> " + addr4.indexOf("������")); // -1, ���� �����϶� -1
		System.out.println("length -> " + addr4.length()); // 20
		System.out.println(("repeat -> " + addr4.repeat(4))); // ����� ���ʱ� ���ʵ�(dong)ä���� X4
		System.out.println("*".repeat(50)); // * X50
		
		addr4 = addr4.replaceAll("���ʱ�", "SeoChoGu");
		System.out.println("replaceAll -> " + addr4); // replaceAll -> ����� SeoChoGu ���ʵ�(dong)ä����
		
		String tel = "010---1234-5678";
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit)); // [010, , , 1234, 5678]
		
		// substring : ���ڿ����� �Ϻ��� ���ڿ��� ���� ��
		//							 0123456789012345678
		String addrsub = new String("Seoul SeoChoGu ���ʵ�");
		String sub1 = addrsub.substring(6, 14); // ������ġ 6, �� ��ġ 14 ��
		System.out.println("substring(int,int) -> " + sub1); // SeoChoGu
		String sub2 = addrsub.substring(10);
		System.out.println("substring(int) -> " + sub2); // hoGu ���ʵ�, ������ġ 10, ������ ���Ѵ�
		
		System.out.println("lower -> " + addrsub.toLowerCase()); // seoul seochogu ���ʵ�, ���ڿ��� �ҹ��ڷ� ��ȯ�� ��ȯ
		System.out.println("upper -> " + addrsub.toUpperCase()); // SEOUL SEOCHOGU ���ʵ�, ���ڿ��� �빮�ڷ� ��ȯ�� ��ȯ
		
		String x = String.valueOf(2500) + 500; // ��ü�� String���� ����ȯ
		System.out.println(x); // 2500500
		
		char c[] = {'J', 'a', 'v', 'a'}; // "Java"
		System.out.println(c); // Java
		System.out.println(String.valueOf(c)); // Java
		
		int d[] = {23,45,67,88};
		System.out.println(d); // [I@4361bd48, �ּҰ�
		
		String data = "		Test		Programming		";
		System.out.println("data -> " + data.trim() + "?"); // ���� ���� ���鹮�� �����
	}
}
