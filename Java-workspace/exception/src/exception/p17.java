package exception;

public class p17 {
	public static void main(String[] args) {
		System.out.println("Main begin");
		try {
			int a = 10/0;
		} catch (Exception e) {
			System.out.println("From Catch Bloack");
		}
		finally {
			System.out.println("From Finally Block");
		}
		System.out.println("Main End");
	}

}
