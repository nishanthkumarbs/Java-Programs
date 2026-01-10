package polymorphism;

public class Employee {
	
	String ename;
	int eid;
	double sal;
	
	public void displayEmployeeInfo() {
		System.out.println("Ename = "+this.ename+" Eid = "+this.eid+" Sal = "+this.sal);
		
	}
	public void work() {
		System.out.println("I work");
	}
	
	public Employee(String ename, int eid, double sal) {
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
}
