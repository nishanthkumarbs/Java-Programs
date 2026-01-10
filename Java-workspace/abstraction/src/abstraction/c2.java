package abstraction;

public class c2 extends c1 implements B1 {
	public void test2() {
		System.out.println("From test2 of c2");
	}
	public static void main(String[] args) {
		B1 ob = new c2();
		ob.test1();
		ob.test2();
	}

}
