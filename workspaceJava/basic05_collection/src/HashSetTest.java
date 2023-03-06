import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		
	}
	
	public void start() {
		
		// Set : �Է� ������ �������� ����
		// 		 ��ü�� �ߺ��� ������� ����
		
		int [] data = {25, 54, 35, 24, 24, 34, 56, 75, 75, 87, 87};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int n:data) {
			hs.add(n);
		}
		
		// HashSet�� ��ü ������
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext()) { // ������ true, ������ false
			int d = i.next();
			System.out.println(d);
		}
	}
	
	public static void main(String[] args) {
		new HashSetTest().start();
	}
}
