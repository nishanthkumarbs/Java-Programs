package exception;

public class p6 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		int a = 10;
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		try {
			System.out.println("try-1");
			int c = a/b;
			System.out.println(c);
			System.out.println("try-2");
		} catch (Exception e) {
			System.out.println("From catch block");
		}
		System.out.println("Main End");
	}

}
