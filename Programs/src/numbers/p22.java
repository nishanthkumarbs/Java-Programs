package numbers;

import java.util.Scanner;

/* Write a java program to check wheather a number is amstrong number */

public class p22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sqrt = num*num;
		int sum = 0;
		while(sqrt!=0) {
			sum = sum + sqrt % 10;
			sqrt /= 10;
		}
		if(num == sum) {
			System.out.println(num+" is a Neon Number");
		} else {
			System.out.println(num+" is not a Neon Number");
		}
	}

}
