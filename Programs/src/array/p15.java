package array;

/* Write a program to find the largest and second largest element in the array */

public class p15 {
	public static void main(String[] args) {
		int[] a = {100,40,30,60,70,100};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] != largest && a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Largest no = "+largest);
		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second Largest no = "+secondLargest);
		} else {
			System.out.println("No Second Largest Number");
		}
	}

}
