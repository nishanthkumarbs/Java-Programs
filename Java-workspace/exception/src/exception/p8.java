package exception;

public class p8 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NumberFormatException e) {
			System.out.println("From catch block-1");
		} catch (NullPointerException e) {
			System.out.println("From catch block-2");
		} catch (ArithmeticException e) {
			System.out.println("From catch block-3");
		}
	}

}
