package exception;

public class p7 {
	public static void main(String[] args) {
		String s ="abc";
		try {
			int n= Integer.parseInt(s);
			System.out.println(n);
		} catch (NumberFormatException ob) {
			System.out.println("From catch block");
		}
	}

}
