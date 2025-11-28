package array;

/* Write a program to find the product of all the elements in an array */

public class p2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int prod=1;
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}
		System.out.println(prod);
	}
}
