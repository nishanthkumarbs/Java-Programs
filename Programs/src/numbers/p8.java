package numbers;

import java.util.Scanner;

/* WAP to count the number of digits in a number */

public class p8 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int count = 0;
		while (num!=0) {
			num/=10;
			count++;
		}
		System.out.println("Count = "+count);
	}
}
