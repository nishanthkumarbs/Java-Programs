package inheritence;

public class m3 extends m2 {

	public void test() {
		System.out.println("From test of m3");
	}
	public static void main(String[] args) {
		m3 ob1 = new m3();
		ob1.test();
		m1 ob2 = ob1;
		ob2.test();
	}
}
