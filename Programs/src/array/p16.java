package array;

/* Write a program to find the smallest element in the array */

public class p16 {
	public static void main(String[] args) {
		int[] a = {40,30,60,70,100};
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Smallest no = "+smallest);
	}

}
