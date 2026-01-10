package exception;

public class p15 {

	public static void main(String[] args) {
		System.out.println("From main Begin");
		try {
			test1();
		} catch (ClassNotFoundException e) {
			System.out.println("From catch block");
		}
		System.out.println("From main end");
		
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println("From test1 Begin");
		test2();
		System.out.println("From test1 end");
		
	}
	public static void test2() throws ClassNotFoundException {
		System.out.println("From test2 Begin");
		Class.forName("abc");
		System.out.println("From test2 end");
		
	}
	
}
