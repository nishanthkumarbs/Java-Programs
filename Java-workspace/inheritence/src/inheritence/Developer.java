package inheritence;

public class Developer extends Employee{
	
	String technology;
	public Developer(String ename, int eid, double sal,String technology) {
		super(ename, eid, sal);
		this.technology = technology;
	}
	public static void main(String[] args) {
		Developer d = new Developer("Disha", 111, 500000, "java");
		System.out.println(d.ename+","+d.eid+","+d.sal+","+d.technology);
	}

}
