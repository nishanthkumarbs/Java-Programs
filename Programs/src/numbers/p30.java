package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is Sunny number */

public class p30 {
	
	public static float squareRoot(float num) {
		float sqrt = num/2;
		float temp = 0;
		while(sqrt - temp != 0) {
			temp = sqrt;
			sqrt = (temp+num/temp)/2;
		}
		return sqrt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = num+1;
		if (squareRoot(num + 1)%1 == 0 ) {
			System.out.println(num+" is a Sunny Number");
		} else {
			System.out.println(num+" is not a Sunny Number");
		}
		
	}

}
