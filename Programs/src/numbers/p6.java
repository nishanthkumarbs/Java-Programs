package numbers;

/* WAP to find the sum of even numbers from 1 to 100 without using any loop */

public class p6 {
	
	static int num = 2;
	static int even_sum = 0;
	
	public static void main(String[] args) {
		if (num <= 100) {
			even_sum+=num;
			num+=2;
			main(null);
		} else {
			System.out.println("Even sum = "+even_sum);
		}	
	}
}