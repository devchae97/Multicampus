package inheritance;

import pac.Information;

public class Student extends Information {

	public static void main(String[] args) {
		// Information i = new Information();
		// ��Ű���� �ٸ��� ���ٺҰ�
		Student s = new Student();
		System.out.println("userid -> " + s.userid);
		
		Information ii = Information.getInstance();
		
	}
}
