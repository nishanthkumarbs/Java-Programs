package String;

/* Write a program to count the to the total number of word in a sentence */

public class p6 {
	
	public static void main(String[] args) {
		String s = "Pooja is Brown and Beautiful";
		String[] x = s.split(" ");
		System.out.println("Total Words = "+x.length);
	}

}

//OR

//public static void main(String[] args) {
//	String s = "Pooja is Brown and Beautiful";
//	String[] x = s.split(" ");
//	int count = 0;
//	for (int i = 0; i < x.length; i++) {
//		if(x[i] != " ") {
//			count++;
//		}
//	}
//	System.out.println("Total Characters = "+count);
//}