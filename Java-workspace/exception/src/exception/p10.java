package exception;

public class p10 {
	public static void main(String[] args) {
		System.out.println("From main Begin");
		try {
			test1();
		} catch (ArithmeticException e) {
			System.out.println("From catch block");
		}
		System.out.println("From main end");
		
	}
	public static void test1() {
		System.out.println("From test1 Begin");
		test2();
		System.out.println("From test1 end");
		
	}
	public static void test2()  {
		System.out.println("From test2 Begin");
		int a = 10/0;
		System.out.println("From test2 end");
		
	}

}
