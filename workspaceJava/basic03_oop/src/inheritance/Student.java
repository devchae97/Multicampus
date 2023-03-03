package inheritance;

import pac.Information;

public class Student extends Information {

	public static void main(String[] args) {
		// Information i = new Information();
		// 패키지가 다르면 접근불가
		Student s = new Student();
		System.out.println("userid -> " + s.userid);
		
		Information ii = Information.getInstance();
		
	}
}
