package abstraction;

public class n1 implements x1 {
	public void test1() {
		System.out.println("From test1 of n1");
	}
	public void test2() {
		System.out.println("From test2 of n1");
	}
	public static void main(String[] args) {
		x1 ob = new n1();
		ob.test1();
		ob.test2();
	}

}
