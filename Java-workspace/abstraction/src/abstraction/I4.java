package abstraction;

public interface I4 {
	
	int a = 500; /*public static final int a = 500 */
	public static void test() {
		System.out.println("From Static test of I4");
	}
	public static void main(String[] args) {
		System.out.println("From main of I4");
		System.out.println(I4.a);
		I4.test();
	}
}
