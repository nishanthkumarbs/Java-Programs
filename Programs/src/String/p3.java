package String;

/* Write a program to check wheather a string is palindrome */

public class p3 {
	public static void main(String[] args) {
		String  s = "malayalam";
		String reverse = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			reverse = reverse + ch[i];
		}
		if (s.equals(reverse)) {
			System.out.println(reverse+" is palindrome");
		} else {
			System.out.println(reverse+" is not palindrome");
		}
		
	}
}