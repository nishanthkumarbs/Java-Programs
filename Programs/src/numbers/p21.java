package numbers;

import java.util.Scanner;

/* Write a java program to check wheather a number is amstrong number */

public class p21 {
	
	public static int noofDigit(int num) {
		int digits = 0;
		while(num != 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
	
	public static boolean isAmstrongNo(int num) {
		int digit = noofDigit(num);
		int sum = 0;
		int temp = num;
		while(temp != 0) {
			int lastDigit = temp%10;
			int power = 1;
			for (int i = 0; i < digit; i++) {
				power *= lastDigit;
			}
			sum += power;
			temp /= 10;
		}
		if (num == sum) {
			return true;
		} else {
			return false;
		}		
	}
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
			
			if (isAmstrongNo(num)) {
				System.out.println(num+" is a  Amstrong Number");
			} else {
				System.out.println(num+" is not a  Amstrong Number");
			}
	}
}
