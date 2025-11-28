package numbers;

import java.util.Scanner;

/* WAP to check wheather a number is automorfic number */

public class p20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sqrt = num*num;
		boolean flag = true;
		while(temp != 0) {
			if(sqrt%10 != temp%10) {
				flag = false;
				break;
			}
			sqrt /= 10;
			temp /= 10;
		}
		if (flag) {
			System.out.println(num+" is a Automorfic Number");
		} else {
			System.out.println(num+" is not a Automorfic Number");
		}
	}
}
