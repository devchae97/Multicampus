import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}
	
	public void start() {
		// TreeMap : key와 value를 이용해 컬렉션을 사용
		//			 key를 기준으로 정렬
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		tm.put("1", new MemberVO(1000, "김짱구", "경영본부", "010-1111-1111"));
		tm.put("A", new MemberVO(2000, "나짱구", "재무부", "010-2222-2222"));
		tm.put("김철수", new MemberVO(3000, "박짱구", "인사부", "010-3333-3333"));
		tm.put("B", new MemberVO(4000, "이짱구", "영업부", "010-4444-4444"));
		tm.put("100", new MemberVO(5000, "신짱구", "개발부", "010-5555-5555"));
		
		Set<String> keys = tm.keySet();
		Iterator<String> keyList = keys.iterator();
		while(keyList.hasNext()) {
			String key = keyList.next();
			MemberVO vo = tm.get(key);
			System.out.println(key + " -> " + vo.toString()); // key 오름차순 정렬
		}
	}
	
	public static void main(String[] args) {
		new TreeMapTest().start();
	}
}
