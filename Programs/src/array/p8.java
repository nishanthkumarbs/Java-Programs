package array;

import java.util.Arrays;

/* Write a program for sorting the array in decreasing order using Selection sort Technique */

public class p8 {
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != 0) {
				int temp = a[i];
				a[i] = a[maxIndex];
				a[maxIndex] = temp;
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
