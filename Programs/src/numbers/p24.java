package numbers;

import java.util.Scanner;

/* Write a program to find the cube root of a number */

public class p24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		float num = sc.nextFloat();
		float cubeRoot = num/3;
		float temp = 0;
		while(cubeRoot - temp != 0) {
			temp = cubeRoot;
			cubeRoot = (2*temp+num/(temp*temp))/3;
		}
		System.out.println(cubeRoot);
	}
}
