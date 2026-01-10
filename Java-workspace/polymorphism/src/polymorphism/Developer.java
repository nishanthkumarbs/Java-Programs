package polymorphism;

public class Developer extends Employee{
	
	public void work() {
		System.out.println("I Develop apps");
	}

	public Developer(String ename, int eid, double sal) {
		super(ename, eid, sal);
	}

	
}
