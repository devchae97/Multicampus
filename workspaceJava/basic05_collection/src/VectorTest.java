import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static Vector vv = new Vector();
	
	public VectorTest() {
		
	}
	
	// �÷��� : ������ �Ǵ� ������ ������ �� �ִ� ��ü
	// List �������̽��� ��ӹ��� Ŭ������ ��������� ���� (index�� ������)
	
	public Vector getData() {
		int num = 20;
		String username = "��¯��";
		Scanner scan = new Scanner (System.in);
		Calendar now = Calendar.getInstance();
		ConsoleCalendarOOP calOOP = new ConsoleCalendarOOP ();
		
		Vector vector = new Vector();
		vector.add(num); // index[0]
		vector.add(scan); // 1 -> 2
		vector.add(username); // 2 -> 3
		
		vector.add(1, now); // 1, �ε����� �����ϸ� �ش� ��ġ�� �߰��ǰ� ������Ʈ���� �ڷ� �и�
		
		vector.add(calOOP); // 4
		
		vv.add("��¯��"); // 0
		vv.add("ȫ¯��"); // 1
		vv.add("��¯��"); // 2
		vv.add("��¯��"); // 3
		
		return vector;
	}
}
