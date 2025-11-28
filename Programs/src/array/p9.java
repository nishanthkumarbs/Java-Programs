package array;

import java.util.Arrays;

/* Write a program for sorting the array in increasing order using Insertion sort Technique */

public class p9 {
	
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j>=0 && temp<a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] x = {50,20,10,40,30};
		System.out.println(Arrays.toString(x));
		insertionSort(x);
		System.out.println(Arrays.toString(x));
	}
}
