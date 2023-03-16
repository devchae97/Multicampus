package employeesOOP;

import java.util.List;
import java.util.Scanner;

public class EmpStart {

	Scanner scan = new Scanner (System.in);
	EmpDAO dao = new EmpDAO();
	
	public EmpStart() {
		start();
	}
	
	public void start() {
		
		do {
			try {
				String menu = menuShow();
				if(menu.equals("1")) { // ȸ�����
					empList();
				}else if (menu.equals("2")) { // ȸ�����
					empAdd();
				}else if (menu.equals("3")) { // ȸ������
					empEdit();
				}else if (menu.equals("4")) { // ȸ������
					empDel();
				}else if (menu.equals("5")) { // ����
					empClose();
				}else if (menu.equals("6")) { // �˻�
					empSearch();
				}
			}catch(Exception e) {
				System.out.println("���� ���Է�");
				e.printStackTrace();
			}
		}while(true);
	}
	
	// �˻�
	public void empSearch() {
		System.out.print("�˻��� -> ");
		String searchWord = scan.nextLine();
		empPrint(dao.empSelect(searchWord));
	}
	
	// ȸ�����
	public void empList() {
		// ȸ����� DB���� ������ �� �޼ҵ带 ȣ��
		// EmpDAO dao = EmpDAO.getInstance();
		// EmpDAO dao = new EmpDAO(); // ���� �ϳ��� ����
		String searchWord = null;
		empPrint(dao.empSelect(searchWord));
	}
	
	// ������
	public void empPrint(List<EmpVO> list) {
		for(int i=0; i<list.size(); i++) {
			EmpVO vo = list.get(i);
			System.out.printf("%6d %12s %10s %16s %20s\n", 
					vo.getMem_id(), vo.getUsername(), vo.getDepart(), vo.getPhone(), vo.getEmail());
		}
	}
	
	// ȸ�����
	public void empAdd() {
		// ȸ����ȣ, �̸�, �μ���, ����ó, �̸���
		// �Է¹��� �����͸� VO�����ϱ� ���ؼ� ��ü�� ����
		EmpVO vo = new EmpVO();
		System.out.print("ȸ����ȣ -> ");
		vo.setMem_id(Integer.parseInt(scan.nextLine()));
		System.out.print("�̸� -> ");
		vo.setUsername(scan.nextLine());
		System.out.print("�μ��� -> ");
		vo.setDepart(scan.nextLine());
		System.out.print("����ó -> ");
		vo.setPhone(scan.nextLine());
		System.out.print("�̸��� -> ");
		vo.setEmail(scan.nextLine());
		
		// EmpDAO dao = new EmpDAO();
		int cnt = dao.empInsert(vo);
		if(cnt>0) {
			System.out.println(vo.getUsername() + "�� ȸ����ϵǾ����ϴ�.");
		}else {
			System.out.println("ȸ����� �����Ͽ����ϴ�.");
		}
	}
	
	// ȸ������
	public void empEdit() {
		EmpVO vo = new EmpVO();
		System.out.print("������ ȸ����ȣ -> ");
		vo.setMem_id(Integer.parseInt(scan.nextLine()));
		
		// ������ �׸�
		System.out.print("������ �׸��� [1.����ó, 2.�μ���, 3.�̸���] ->");
		String editField  = scan.nextLine();
		if(editField.equals("1")) {
			vo.setFieldName("Phone");
			System.out.print("������ ����ó -> ");
		}else if(editField.equals("2")) {
			vo.setFieldName("Depart");
			System.out.print("������ �μ��� -> ");
		}else if(editField.equals("3")) {
			vo.setFieldName("Email");
			System.out.print("������ �̸��� -> ");
		}
		vo.setPhone(scan.nextLine());
		
		// EmpDAO dao = EmpDAO.getInstance();
		int cnt = dao.empUpdate(vo);
		if(cnt>0) {
			System.out.println(vo.getPhone() + "���� �����Ǿ����ϴ�.");
		}else {
			System.out.println("���������Ͽ����ϴ�.");
		}
	}
	
	// ȸ������ ����
	public void empDel() {
		System.out.print("������ ȸ����ȣ -> ");
		int mem_id = Integer.parseInt(scan.nextLine());
		// EmpDAO dao = new EmpDAO();
		int result = dao.empDelete(mem_id);
		if(result>0) {
			System.out.println(mem_id + "ȸ���� �����Ǿ����ϴ�.");
		}else {
			System.out.println("ȸ������ ����");
		}
	}
	
	// ����
	public void empClose() {
		System.exit(0);
	}
	
	// �޴�
	public String menuShow() {
		System.out.print("�޴� [1.ȸ����� 2.ȸ�����, 3.ȸ������, 4.ȸ������, 5.����, 6.�˻�] -> ");
		return scan.nextLine();
	}	
	
	public static void main(String[] args) {
		new EmpStart();
	}
}