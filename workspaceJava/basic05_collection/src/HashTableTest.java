import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public HashTableTest() {
		
	}
	
	public void start() {
		
		// Map : key와 value를 이용해 객체를 생성
		// 		 key가 중복되면 안됨
		
		Hashtable<String, MemberVO> ht = new Hashtable<String, MemberVO>();
		
		ht.put("1", new MemberVO(1000, "신짱구", "영업부", "010-1234-1111"));
		ht.put("A", new MemberVO(2000, "신짱구2", "영업부", "010-1234-2222"));
		ht.put("스트링", new MemberVO(3000, "신짱구3", "영업부", "010-1234-3333"));
		ht.put("B", new MemberVO(4000, "신짱구4", "영업부", "010-1234-4444"));
		ht.put("100", new MemberVO(5000, "신짱구5", "영업부", "010-1234-5555"));
		
		// 키를 이용한 객체 얻어오기
		MemberVO vo1 = ht.get("B");
		System.out.println(vo1.toString());
		System.out.println("******************************");
		
		// key 목록 구하기
		Set<String> keyList = ht.keySet();
		Iterator<String> ii = keyList.iterator();
		while(ii.hasNext()) {
			String key = ii.next();
			MemberVO vo2 = ht.get(key);
			System.out.println(vo2.toString());
		}
		System.out.println("------------------------------");
		
		// value 목록 구하기
		Collection<MemberVO> value = ht.values();
		Iterator<MemberVO> iii = value.iterator();
		while(iii.hasNext()) {
			System.out.println(iii.next().toString());
		}
	}
	
	public static void main(String[] args) {
		new HashTableTest().start();
	}
}
