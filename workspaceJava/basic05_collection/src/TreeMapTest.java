import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		
	}
	
	public void start() {
		// TreeMap : key�� value�� �̿��� �÷����� ���
		//			 key�� �������� ����
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		tm.put("1", new MemberVO(1000, "��¯��", "�濵����", "010-1111-1111"));
		tm.put("A", new MemberVO(2000, "��¯��", "�繫��", "010-2222-2222"));
		tm.put("��ö��", new MemberVO(3000, "��¯��", "�λ��", "010-3333-3333"));
		tm.put("B", new MemberVO(4000, "��¯��", "������", "010-4444-4444"));
		tm.put("100", new MemberVO(5000, "��¯��", "���ߺ�", "010-5555-5555"));
		
		Set<String> keys = tm.keySet();
		Iterator<String> keyList = keys.iterator();
		while(keyList.hasNext()) {
			String key = keyList.next();
			MemberVO vo = tm.get(key);
			System.out.println(key + " -> " + vo.toString()); // key �������� ����
		}
	}
	
	public static void main(String[] args) {
		new TreeMapTest().start();
	}
}
