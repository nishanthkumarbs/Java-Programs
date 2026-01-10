package exception;

public class p13 {
	static {
		System.out.println("From static block of p13");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("From main of p13");
		Class.forName("exception.p11");
	}

}
