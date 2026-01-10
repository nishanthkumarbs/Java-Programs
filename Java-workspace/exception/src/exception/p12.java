package exception;

public class p12 {
	static {
		System.out.println("From static block of p12");
	}
	public static void main(String[] args) {
		System.out.println("From main of p12");
		try {
			Class.forName("exception.p11");
		} catch (Exception e) {
			System.out.println("From catch block");
		}
	}


}
