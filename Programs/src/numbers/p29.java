package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is Emirp number */

public class p29 {
	
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
	
	public static int reverseNo(int num) {
		int temp = num;
		int lastDigit;
		int reverse = 0;
		
		while (temp!=0) {
			lastDigit = temp%10;
			temp/=10;
			reverse= reverse*10+lastDigit;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			if (isPrime(reverseNo(num))) {
				System.out.println(num+" is a Emirp Number");
			} else {
				System.out.println(num+" is not a Emirp Number");
			}
		} else {
			System.out.println(num+" is not prime number");
		}
	}
}
