package array;

import java.util.Arrays;

/* Write a program to copy the elements of one array in another array */

public class p3 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int[] b = new int[a.length];
		int[] c = a.clone();
		
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
