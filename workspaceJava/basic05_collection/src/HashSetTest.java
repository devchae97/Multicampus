import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		
	}
	
	public void start() {
		
		// Set : 입력 순서를 유지하지 않음
		// 		 객체의 중복을 허용하지 않음
		
		int [] data = {25, 54, 35, 24, 24, 34, 56, 75, 75, 87, 87};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int n:data) {
			hs.add(n);
		}
		
		// HashSet의 객체 얻어오기
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext()) { // 있으면 true, 없으면 false
			int d = i.next();
			System.out.println(d);
		}
	}
	
	public static void main(String[] args) {
		new HashSetTest().start();
	}
}
