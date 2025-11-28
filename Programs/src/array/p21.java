package array;

import java.util.Arrays;

/* Write a program to right to rotate the array by 2 times */

public class p21 {
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int rotate = 2;
		for (int i = 0; i < rotate; i++) {
			int last = a[a.length - 1];
			for (int j = a.length-1; j > 0; j--) {
				a[j] = a[j-1];
			}
			a[0] = last;
		}
		System.out.println(Arrays.toString(a));
	}

}
