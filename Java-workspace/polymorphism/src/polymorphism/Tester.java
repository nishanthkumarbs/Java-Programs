package polymorphism;

public class Tester extends Employee{
	
	public void work() {
		System.out.println("I Test apps");
	}

	public Tester(String ename, int eid, double sal) {
		super(ename, eid, sal);
	}

}
