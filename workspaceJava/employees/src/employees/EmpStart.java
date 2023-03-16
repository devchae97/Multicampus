package employees;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import module.EmpDataSet;
import module.EmpVO;

public class EmpStart {

	Scanner scan = new Scanner(System.in);
	
	public EmpStart() {
		// ���� ��ϵǾ� �ִ� ������
		EmpDataSet.dataSet(); // �ʱ� ������ ����
		do {
			try {
				System.out.print(menu());
				int inMenu = Integer.parseInt(scan.nextLine());
				if(inMenu==6) {
					empStop();
				}else if(inMenu==5) {
					empDel();
				}else if(inMenu==4) {
					empEdit();
				}else if(inMenu==3) {
					empInsert();
				}else if(inMenu==2) {
					getNameSearch();
				}else if(inMenu==1) {
					empListOutPut();
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println("�޴� ���Է�");
			}
		}while(true);
	}
	
	// ������
	public void empListOutPut() {
		titlePrint(); // ���� ���
		// ���� ��� value(vo��ü)�� ���� ��� ���
		Collection<EmpVO> emp = EmpDataSet.empList.values();
		Iterator<EmpVO> i = emp.iterator();
		
		while(i.hasNext()) {
			EmpVO v = i.next();
			System.out.println(v.toString());
		}
	}
	
	public void titlePrint() {
		System.out.println("�����ȣ\t�����\t�μ���\t����ó");
	}
	
	// ��� �˻�
	public void getNameSearch() {
		System.out.print("�˻��� ����� �Է� \n����� : ");
		String searchName = scan.nextLine();
		
		// vo
		Collection<EmpVO> list = EmpDataSet.empList.values();
		Iterator<EmpVO> ii = list.iterator();
		int cnt = 0;
		while(ii.hasNext()) {
			EmpVO v = ii.next();
			if(v.getEmpName().equals(searchName)) {
				System.out.println(v.toString());
				cnt++;
			}
		}
		System.out.println(cnt + "�� �˻��Ϸ�");
	}
	
	// ������
	public void empInsert() {
		EmpVO vo = new EmpVO(); // �Է¹��� ��������� ������ vo
		System.out.print("�����ȣ : ");
		vo.setEmpNo(Integer.parseInt(scan.nextLine()));
		System.out.print("����� : ");
		vo.setEmpName(scan.nextLine());
		System.out.print("�μ��� : ");
		vo.setDepartment(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
		vo.setTel(scan.nextLine());
		
		// �÷��ǿ� vo �߰�
		EmpDataSet.empList.put(vo.getEmpNo(), vo);
		System.out.println("��������� ��ϵǾ����ϴ�.");
	}
	
	// �������
	public void empEdit() {
		// � ����� ������ ������ �Է¹ޱ�
		System.out.print("������ ����� �����ȣ �Է� \n�����ȣ : ");
		int editEmpNo = Integer.parseInt(scan.nextLine());
		System.out.print("������ ���ϴ� �׸� ���� \n[1.�μ���, 2.����ó]\n�׸��� : ");
		String editMenu = scan.nextLine();
		
		if(editMenu.equals("1")) {
			departmentEdit(editEmpNo);
		}else if(editMenu.equals("2")) {
			telEdit(editEmpNo);
		}else {
			System.out.println("�׸� �缱��");
		}
	}
	
	// �μ������� �޼ҵ�
	public void departmentEdit(int empNo) {
		EmpVO vo = EmpDataSet.empList.get(empNo);
		System.out.print("���ο� �μ��� �Է�/n�μ��� : ");
		String editDepartName = scan.nextLine();
		vo.setDepartment(editDepartName); // �μ��� ����
		System.out.println(vo.getEmpName() + "���� �μ����� " + vo.getDepartment() + "�� ����Ϸ�");
	}
	
	// ����ó���� �޼ҵ�
	public void telEdit(int empNo) {
		EmpVO vo = EmpDataSet.empList.get(empNo);
		System.out.print("���ο� ����ó�� �Է�\n����ó : ");
		vo.setTel(scan.nextLine());
		System.out.println(vo.getEmpName() + "���� ����ó�� " + vo.getTel() + "�� ����Ϸ�");
	}
	
	// �������
	public void empDel() {
		System.out.print("������ ����� �����ȣ�� �Է�\n�����ȣ : ");
		int empNo = Integer.parseInt(scan.nextLine());
		EmpDataSet.empList.remove(empNo); // ��ü ������
		System.out.println(empNo + "�� ����� ���� �����Ϸ�");
	}
	
	// ����
	public void empStop() {
		try {
			// ��������� �ִ� empList�� ���Ϸ� ���� �� ����
			File f = new File("d://testFolder","employee.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(EmpDataSet.empList);
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			System.out.println("���� ����" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String menu() {
		return "MENU [1.������, 2.����˻�, 3.������, 4.�������, 5.�������, 6.����]\nMENU ���� : ";
	}
	
	public static void main(String[] args) {
		new EmpStart();
	}
}