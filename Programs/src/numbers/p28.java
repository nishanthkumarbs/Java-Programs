package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is tech number */

public class p28 {
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while (num != 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
	
	public static boolean isTechNumber(int num) {
		int divisor = 1;
		for (int i = 0; i < noOfDigits(num)/2; i++) {
			divisor *= 10;
		}
		int firstHalf = num / divisor;
		int secondHalf = num % divisor;
		int sumsqr = (firstHalf + secondHalf) * (firstHalf + secondHalf);
		if (num == sumsqr) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (noOfDigits(num)%2 == 0) {
			if (isTechNumber(num)) {
				System.out.println(num+" is a Tech Number");
			} else {
				System.out.println(num+" is not a Tech Number");
			}
		} else {
			System.out.println(num+" doesn't Contain Even no of Digits");
		}
	}
}
