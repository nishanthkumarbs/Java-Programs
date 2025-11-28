package numbers;

import java.util.Scanner;

/* WAP to reverse a number */

public class p11 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int lastDigit;
		int reverse = 0;
		
		while (temp!=0) {
			lastDigit = temp%10;
			temp/=10;
			reverse= reverse*10+lastDigit;
		}
		System.out.println("Reverse = "+reverse);
	}

}
