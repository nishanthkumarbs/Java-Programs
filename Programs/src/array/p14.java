package array;

/* Write a program to find the largest element in the array */

public class p14 {
	public static void main(String[] args) {
	int[] a = {40,30,60,70,100};
	int largest = Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (a[i] > largest) {
			largest = a[i];
		}
	}
	System.out.println("Largest no = "+largest);
}

}
