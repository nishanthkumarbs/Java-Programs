package exception;

public class p18 {
	public static void main(String[] args) {
		System.out.println("Main begin");
		try {
			int a = 10/0;
		} 
		finally {
			System.out.println("From Finally Block");
		}
		System.out.println("Main End");
	}

}
