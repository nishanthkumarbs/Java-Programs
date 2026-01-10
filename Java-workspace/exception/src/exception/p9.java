package exception;

public class p9 {
	public static void main(String[] args) {
		try {
			int[] a = {10,20,30};
			System.out.println(a[5]);
		} catch (ArithmeticException e) {
			System.out.println("From catch block-1");
		} catch (RuntimeException e) {
			System.out.println("From catch block-2");
		} catch (Exception e) {
			System.out.println("From catch block-3");
		} catch (Throwable e) {
			System.out.println("From catch block-4");
		}
	}

}
