package array;

import java.util.Arrays;

/* Write a program to left to rotate the array by 2 times */

public class p20 {
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int rotate = 2;
		for (int i = 0; i < rotate; i++) {
			int first =a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j] = a[j+1];
			}
			a[a.length - 1] = first;
		}
		System.out.println(Arrays.toString(a));
	}

}
