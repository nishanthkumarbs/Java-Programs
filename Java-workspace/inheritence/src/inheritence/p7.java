package inheritence;

public class p7 extends p6{
	static int b = 1000;
	public static void stest2() {
		System.out.println("From static stest2 of p7");
	}
	public static void main(String[] args) {
		System.out.println(p7.a);
		p7.stest1();
		System.out.println(p7.b);
		p7.stest2();
	}
}
