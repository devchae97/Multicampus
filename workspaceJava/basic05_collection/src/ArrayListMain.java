
public class ArrayListMain {

	public ArrayListMain() {
		
	}
	
	public void start() {
		ArrayListTest emp = new ArrayListTest();
		// emp.list > vo, vo2, vo3
		for(int i=0; i<emp.list.size(); i++) {
			MemberVO vo = (MemberVO)emp.list.get(i);
			System.out.println(vo.toString());
		}
		
		for(Object obj : emp.list) {
			MemberVO vo = (MemberVO)obj;
			int num = vo.getNum();
			String username = vo.getUsername();
			String depart = vo.getDepartment();
			String tel = vo.getTel();
			System.out.println(vo.toString());
		}
		
		for(MemberVO vo : emp.list) {
			System.out.println(vo.toString());
		}
	}
	
	public static void main(String[] args) {
		new ArrayListMain().start();
	}
}
