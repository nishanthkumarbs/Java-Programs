package numbers;

/* WAP to print the prime numbers from 1 to 1000 */

public class p14 {
	
	public static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}

}
