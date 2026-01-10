package Object_programs;

public class Employee {

	String ename;
	int eid;
	double sal;
	public Employee(String ename,int eid,double sal) {
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public String toString() {
		return "Ename = "+this.ename+" Eid = "+this.eid+" Sal = "+sal;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Disha", 111, 500000);
		Employee e2 = new Employee("Thamanna", 222, 400000);
		Employee e3 = new Employee("Deepika", 333, 300000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}
