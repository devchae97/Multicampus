import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	// ArrayList list = new ArrayList();
	// ArrayList<MemberVO> list = new ArrayList<MemberVO> ();
	List<MemberVO> list = new ArrayList<MemberVO> ();
	
	public ArrayListTest() {
		// �����ȣ ����� �μ��� ����ó
		MemberVO vo = new MemberVO();
		vo.setNum(100);
		vo.setUsername("������");
		vo.setDepartment("�ѹ���");
		vo.setTel("010-9999-9999");
		
		MemberVO vo2 = new MemberVO(200, "������2", "������", "010-9999-8888");
		MemberVO vo3 = new MemberVO(300, "������3", "�����", "010-9999-7777");
		
		list.add(vo);
		list.add(vo2);
		list.add(vo3);
		// list.add("String"); // ����

	}
}
