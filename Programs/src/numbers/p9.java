package numbers;

import java.util.Scanner;

/* WAP to find the sum of all the digits in a number */

public class p9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int lastDigit;
		
		while (num!=0) {
			lastDigit = num%10;
			sum+=lastDigit;
			num/=10;
		}
		System.out.println("Sum = "+sum);
	}
}
