package array;

import java.util.Arrays;
import java.util.TreeSet;

/* Write a program to find the largest, second largest and third largest element in the array */

public class p18 {
	public static void main(String[] args) {
		int[] a = {100,40,30,60,70,50,80};
		Arrays.sort(a);
		System.out.println("Largest = "+a[a.length-1]);
		System.out.println("Second Largest = "+a[a.length-2]);
		System.out.println("Third Largest = "+a[a.length-3]);
		
		System.out.println("-----------------------------------------------");
		
		int[] b = {100,40,30,60,70,50,80,100,80,70};
		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 0; i < b.length; i++) {
			t.add(b[i]);
		}
		Object[] x = t.toArray();
		System.out.println("Largest = "+x[x.length-1]);
		System.out.println("Second Largest = "+x[x.length-2]);
		System.out.println("Third Largest = "+x[x.length-3]);
	}
}
