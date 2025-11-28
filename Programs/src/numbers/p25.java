package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is Strong no or Peterson no or Krishnamurthy no */

public class p25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			int lastDigit = temp % 10;
			int factorial = 1;
			for (int i = lastDigit; i >=1; i--) {
				factorial *= i; 
			}
			sum += factorial;
			temp /= 10;
		}
		if (sum == num) {
			System.out.println(num+" is a Strong Number");
		} else {
			System.out.println(num+" is not a Strong Number");
		}
	}

}
