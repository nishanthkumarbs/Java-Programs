package array;

/* Write a program to find the smallest and second smallest element in the array */

public class p17 {
	public static void main(String[] args) {
		int[] a = {100,40,30,60,70,100};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			} else if (a[i] != smallest && a[i] < secondSmallest) {
				secondSmallest = a[i];
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Smallest no = "+smallest);
		if (secondSmallest != Integer.MAX_VALUE) {
			System.out.println("Smallest Largest no = "+secondSmallest);
		} else {
			System.out.println("No Second Smallestt Number");
		}
	}

}
