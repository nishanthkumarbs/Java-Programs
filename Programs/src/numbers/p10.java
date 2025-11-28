package numbers;

import java.util.Scanner;

/* WAP to find the product of all the digits in a number */

public class p10 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int product = 1;
		int lastDigit;
		
		while (num!=0) {
			lastDigit = num%10;
			product*=lastDigit;
			num/=10;
		}
		System.out.println("Product = "+product);
	}

}
