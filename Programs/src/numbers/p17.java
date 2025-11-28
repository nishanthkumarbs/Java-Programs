package numbers;

import java.util.Scanner;

/* WAP to calculate the factorial of a number using method recursion*/

public class p17 {
	
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num*factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial = "+factorial(num));
	}

}
