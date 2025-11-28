package array;

import java.util.Arrays;

/* Important */
/* Write a program to print the duplicate elements in an array */

public class p12 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,10,20,10,30,10,20};
		
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				System.out.println(a[i]);
			}
			
		}
	}
}



// OR

//public static void main(String[] args) {
//	int[] a = {10,20,30,40,10,20,10,30,10,20};
//	for (int i = 0; i < a.length; i++) {
//		for (int j = i+1; j < a.length; j++) {
//			if (a[i]==a[j]) {
//				System.out.println(a[j]);
//				break;
//			}
//		}
//		
//	}
//}