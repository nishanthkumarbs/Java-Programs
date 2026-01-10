package abstraction;

public class h1 implements J1,J2,J3 {
	
	public void test1() {
		System.out.println("From test1 of h1");
	}
	public void test2() {
		System.out.println("From test2 of h1");
	}
	public void test3() {
		System.out.println("From test3 of h1");
	}
	public static void main(String[] args) {
		h1 ob = new h1();
		ob.test1();
		ob.test2();
		ob.test3();
	}

}
