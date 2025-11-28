package String;

/* Write a program to reverse a sentence */

public class p5 {
	public static void main(String[] args) {
		String s = "Abhi Is Handsome";
		String[] x = s.split(" ");
		String reverse = "";
		for (int i = x.length-1; i >=0; i--) {
			reverse = reverse + x[i]+" ";
		}
		System.out.println("Reversed Senetence = "+reverse);
	}

}
