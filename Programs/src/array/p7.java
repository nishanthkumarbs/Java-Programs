package array;

import java.util.Arrays;

/* Write a program for sorting the array in increasing order using Selection sort Technique */

public class p7 {
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != 0) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] x = {50,20,10,40,30};
		System.out.println(Arrays.toString(x));
		selectionSort(x);
		System.out.println(Arrays.toString(x));
	}

}
