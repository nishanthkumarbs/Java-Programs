package numbers;

import java.util.Scanner;

/* WAP to calculate the factorial of a number */

public class p16 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial*=i;
		}
		System.out.println("Factorial = "+factorial);
	}
}
