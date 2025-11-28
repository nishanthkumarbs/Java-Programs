package array;

import java.util.Arrays;

/* Write a program to find the frequency of occurance of every element in an Array */

public class p11 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,10,20,10,30,10,20};
		int[] frequency = new int[a.length];
		int counted = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i+1; j < frequency.length; j++) {
				if (a[i]==a[j]) {
					count++;
					frequency[j] = counted;
				}
			}
			if (frequency[i]!=counted) {
				frequency[i] = count;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------------");
		System.out.println(Arrays.toString(frequency));
		System.out.println("-----------------------------------------");
		for (int i = 0; i < a.length; i++) {
			if (frequency[i] != counted) {
				System.out.println(a[i]+" = "+frequency[i]);
			}
		}
	}

}
