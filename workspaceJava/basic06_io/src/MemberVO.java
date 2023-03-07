import java.io.Serializable;

public class MemberVO implements Serializable {

	// 파일로 객체를 저장하기 위해서는 저장할 클래스를 직렬화해야 한다.
	// interface Serializable을 상속받는다.
	
	// 사원번호 사원명 부서명 연락처
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

