package String;

import java.util.Arrays;

/* Write a program to sort the character in a string in Alphabetical order */

public class p4 {
	
	public static void bubbleSort(char[] a) {
		for (int i = 0; i < a.length-i; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "dishapatani";
		char[] ch = s.toCharArray();
		bubbleSort(ch);
		String x = new String(ch);
		System.out.println(s);
		System.out.println(x);
	}

}
