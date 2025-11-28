package numbers;

/* WAP to print the first 10 numbers in fibonocci series */

public class p18 {
	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 1;
		int next_no;
		int count = 10;
		System.out.print(x1+ "," +x2);
		
		while (count-2 > 0) {
			next_no = x1 + x2;
			System.out.print(","+next_no);
			x1 = x2;
			x2 = next_no;
			count--;
		}
	}
}
