import java.io.Serializable;

public class MemberVO implements Serializable {

	// ���Ϸ� ��ü�� �����ϱ� ���ؼ��� ������ Ŭ������ ����ȭ�ؾ� �Ѵ�.
	// interface Serializable�� ��ӹ޴´�.
	
	// �����ȣ ����� �μ��� ����ó
	private int num;
	private String username;
	private String department;
	private String tel;
	
	public MemberVO() {
		
	}

	public MemberVO(int num, String username, String department, String tel) {
		this.num = num;
		this.username = username;
		this.department = department;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return num + "\t" + username + "\t" + department + "\t" + tel;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

