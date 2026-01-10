package exception;

import java.util.Scanner;

public class p16 {
	static final int ActualPin = 1993;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int EnterdPin = sc.nextInt();
		if (EnterdPin == ActualPin) {
			System.out.println("Transaction continues");
			
		} else {
			System.out.println("Transaction Declined");
			throw new ArithmeticException();

		}
	}

}
