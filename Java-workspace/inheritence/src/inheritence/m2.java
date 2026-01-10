package inheritence;

public class m2 extends m1{

	public void test() {
		System.out.println("From test of m2");
	}
	public static void main(String[] args) {
		m2 ob1 = new m2();
		ob1.test();
		m1 ob2 = ob1; /*Upcasting*/
		ob2.test();
	}
}
