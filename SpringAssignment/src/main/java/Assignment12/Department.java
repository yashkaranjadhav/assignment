package Assignment12;

public class Department {

	
	int deptno;
	String deptname;
	Employee empobj;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Employee getEmpobj() {
		return empobj;
	}
	public void setEmpobj(Employee empobj) {
		this.empobj = empobj;
	}
	public Department(int deptno, String deptname, Employee empobj) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.empobj = empobj;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
}
