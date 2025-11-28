package numbers;

/* WAP to swap two numbers by using additional or temporary variable */

public class p1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println(a+","+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+","+b);
	}
}
 