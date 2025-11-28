package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is Spy number */

public class p27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int prod = 1;
		
		while (temp != 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			sum += lastDigit;
			prod *= lastDigit;
		}
		if (sum == prod) {
			System.out.println(num+" is a Spy Number");
		} else {
			System.out.println(num+" is not a Spy Number");
		}
	}
}
