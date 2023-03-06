import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	// ArrayList list = new ArrayList();
	// ArrayList<MemberVO> list = new ArrayList<MemberVO> ();
	List<MemberVO> list = new ArrayList<MemberVO> ();
	
	public ArrayListTest() {
		// 사원번호 사원명 부서명 연락처
		MemberVO vo = new MemberVO();
		vo.setNum(100);
		vo.setUsername("신형만");
		vo.setDepartment("총무부");
		vo.setTel("010-9999-9999");
		
		MemberVO vo2 = new MemberVO(200, "신형만2", "영업부", "010-9999-8888");
		MemberVO vo3 = new MemberVO(300, "신형만3", "감사부", "010-9999-7777");
		
		list.add(vo);
		list.add(vo2);
		list.add(vo3);
		// list.add("String"); // 에러

	}
}
