package numbers;

import java.util.Scanner;

/* WAP to check wheather a number is prime number */

public class p13 {
	
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
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if (isPrime(num)) {
			System.out.println(num+" is prime number");
		} else {
			System.out.println(num+" is not prime number");
		}
	}

}
