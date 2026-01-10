package inheritence;

public class m7 extends m6 {
	public void test() {
		System.out.println("From test of m5");
	}
	public static void main(String[] args) {
		m7 ob = new m7();
		ob.test();
	}

}
