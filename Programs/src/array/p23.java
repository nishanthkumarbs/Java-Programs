package array;

import java.util.Arrays;

/* Write a program for Binary search */

public class p23 {
	public static void binarySearch(int[] a,int key) {
		Arrays.sort(a);
		int firstIndex = 0;
		int lastIndex = a.length-1;
		int midIndex;
		boolean flag = false;
		while(firstIndex <= lastIndex) {
			midIndex = (firstIndex + lastIndex)/2;
			if (a[midIndex] == key) {
				flag = true;
				break;
			} else if (a[midIndex] > key) {
				lastIndex = midIndex;
			} else if (a[midIndex] < key) {
				firstIndex = midIndex;
			}
		}
		if (flag) {
			System.out.println(key+" is Prasent");
		} else {
			System.out.println(key+" is Not Prasent");
		}
		
	}
	public static void main(String[] args) {
		int[] a = {40,25,10,20,50};
		binarySearch(a, 20);
	}

}
