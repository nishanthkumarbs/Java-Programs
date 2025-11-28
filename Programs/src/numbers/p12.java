package numbers;

import java.util.Scanner;

/* WAP to check wheather a number is palindrome */

public class p12 {
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
		if (reverse==num) {
			System.out.println(num+" Number is palindrome");
		} else {
			System.out.println(num+" Number is not palindrome");
		}
	}

}
