package String;

/* Write a program to reverse a string */


public class p2 {
	public static void main(String[] args) {
		String  s = "Java";
		String reverse = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			reverse = reverse + ch[i];
		}
		System.out.println("Reversed String = "+reverse);
	}
}
