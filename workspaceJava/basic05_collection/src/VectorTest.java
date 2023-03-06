import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static Vector vv = new Vector();
	
	public VectorTest() {
		
	}
	
	// 컬렉션 : 데이터 또는 정보를 저장할 수 있는 객체
	// List 인터페이스를 상속받은 클래스는 저장순서를 유지 (index를 가진다)
	
	public Vector getData() {
		int num = 20;
		String username = "신짱구";
		Scanner scan = new Scanner (System.in);
		Calendar now = Calendar.getInstance();
		ConsoleCalendarOOP calOOP = new ConsoleCalendarOOP ();
		
		Vector vector = new Vector();
		vector.add(num); // index[0]
		vector.add(scan); // 1 -> 2
		vector.add(username); // 2 -> 3
		
		vector.add(1, now); // 1, 인덱스를 지정하면 해당 위치에 추가되고 엘리멘트들이 뒤로 밀림
		
		vector.add(calOOP); // 4
		
		vv.add("김짱구"); // 0
		vv.add("홍짱구"); // 1
		vv.add("박짱구"); // 2
		vv.add("왕짱구"); // 3
		
		return vector;
	}
}
