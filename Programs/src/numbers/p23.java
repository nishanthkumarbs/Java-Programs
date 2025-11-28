package numbers;

import java.util.Scanner;

/* Write a program to find the square root of a number */

public class p23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		float num = sc.nextFloat();
		float sqrt = num/2;
		float temp = 0;
		while(sqrt - temp != 0) {
			temp = sqrt;
			sqrt = (temp+num/temp)/2;
		}
		System.out.println(sqrt);
	}
}
