package swing_study.panel;

import java.util.List;

public class Department {
	private int deptNo;
	private String deptName;
	private int floor;
	
	

	public Department() {
		// TODO Auto-generated constructor stub
	}

	

	public Department(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s(%d) ", deptName, deptNo);
	}
//	deptName=%s, floor=%s

}
