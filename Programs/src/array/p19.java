package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* Write a program to remove duplicate elements in an array */

public class p19 {
	public static void main(String[] args) {
		int[] a = {20,40,30,60,20,30,20,40};
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		a = new int[l.size()];
		int j = 0;
		for(Integer lv:l) {
			a[j] = lv;
			j++;
		}
		System.out.println(Arrays.toString(a));
	}

}
