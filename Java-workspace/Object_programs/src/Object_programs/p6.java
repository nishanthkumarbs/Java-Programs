package Object_programs;

public class p6 {
	int a = 100;
	int b = 200;
	
	public void finalize() throws Throwable {
		System.out.println("Nishanth");
	}
	public static void main(String[] args) {
		p6 ob1 = new p6();
		ob1 = new p6();
		
		p6 ob2 = new p6();
		ob2 = null;
		
		System.gc();
		
	}
}
