package inheritence;

public class m4 {

	private void test() {
		System.out.println("From test of m4");
	}
	public static void main(String[] args) {
		m5 ob1 = new m5();
		ob1.test();
		m4 ob2 = ob1;
		ob2.test();
	}
}
