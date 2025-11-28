package array;

import java.util.Arrays;

/* Write a program for sorting the array in decreasing order using BubbleSort technique */

public class p6 {
	
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length-i; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] x = {40,30,10,50,20};
		System.out.println(Arrays.toString(x));
		bubbleSort(x);
		System.out.println(Arrays.toString(x));
	}

}
