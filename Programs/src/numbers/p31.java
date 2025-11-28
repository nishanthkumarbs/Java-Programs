package numbers;

import java.util.Scanner;

/* Write a program to check wheather a number is Fascinating number */

public class p31 {
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while (num != 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
	
	public static boolean isFascinatingno(int num) {
		String s = ""+num+2*num+3*num;
		boolean flag = true;
		
		for (char ch = '1'; ch <= '9'; ch++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ch) {
					count++;
				}
			}
			if (count != 1) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if (noOfDigits(num) >= 3) {
			if (isFascinatingno(num)) {
				System.out.println(num+" is a Fascinating Number");
			} else {
				System.out.println(num+" is not a Fascinating Number");
			}
		} else {
			System.out.println(num+" doesn't contain sufficent number of digits ");
		}
	}
}
