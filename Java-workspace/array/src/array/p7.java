package array;

import java.util.Arrays;

public class p7 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length/2; i++) {
			a[i] = a[i] + a[a.length-1-i];
			a[a.length-1-i] = a[i] - a[a.length-1-i];
			a[i] = a[i] - a[a.length-1-i];
		}
		System.out.println(Arrays.toString(a));
	}

}
