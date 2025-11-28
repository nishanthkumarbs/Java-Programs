package array;

import java.util.LinkedHashSet;
import java.util.Set;

/* Write a program to print the duplicate elements in an array using collection */

public class p13 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 10, 20, 10, 30, 10, 20};

        Set<Integer> l = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
			if (!l.add(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

}
