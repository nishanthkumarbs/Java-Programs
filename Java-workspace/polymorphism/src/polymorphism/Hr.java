package polymorphism;

public class Hr extends Employee {

	public void work() {
		System.out.println("I Recrit resources");
	}
	
	public Hr(String ename, int eid, double sal) {
		super(ename, eid, sal);
	}

}
