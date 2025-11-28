package numbers;

import java.util.Scanner;

/* WAP to print the first 10 numbers in fibonocci series using method recursion */

public class p19 {
	
	static int x1 = 0;
	static int x2 = 1;
	static int next_no;
	
	public static void printFibonocci(int count) {
		next_no = x1 + x2;
		System.out.print(","+next_no);
		x1 = x2;
		x2 = next_no;
		count--;
		if (count > 0) {
			printFibonocci(count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int count = sc.nextInt();
		System.out.print(x1+ "," +x2);
		printFibonocci(count-2);
	}
}
