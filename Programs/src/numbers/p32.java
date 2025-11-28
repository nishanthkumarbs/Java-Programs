package numbers;

import java.util.Scanner;

/* Write a program to check wheather the given year is leap year */

public class p32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int year = sc.nextInt();

		boolean flag = false;
		if (year%4 == 0) {
			if ( year%100 == 0 && year%400 != 0) {
				flag = false;
			} else {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is not a leap year");
		}
	}

}
