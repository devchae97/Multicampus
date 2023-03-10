package module;

import java.io.Serializable;

public class EmpVO extends Object implements Serializable{

	private int empNo;
	private String empName;
	private String department;
	private String tel;
	
	public EmpVO() {
		
	}
	
	public EmpVO(int empNo, String empName, String department, String tel) {
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return empNo + "\t" + empName + "\t" + department + "\t" + tel;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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
