package inheritence;

public class Employee_p {
	
	String ename;
	int eid;
	double sal;
	
	public void displayEmployeeinfo() {
		System.out.println("Ename = "+this.ename+" Eid = "+this.eid+" Sal = "+this.sal);
	}
	
	public Employee_p(String ename, int eid, double sal) {
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}

}
