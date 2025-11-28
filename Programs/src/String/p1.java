package String;

/* Write a program to count the number of character in a string */

public class p1 {
	public static void main(String[] args) {
		String  s = "Java Is Easy";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(ch[i] != ' ') {
				count++;
			}
		}
		System.out.println("Total Characters = "+count);
	}

}

//OR

//public static void main(String[] args) {
//	String  s = "Java Is Easy";
//	int count = 0;
//	for (int i = 0; i < s.length(); i++) {
//		if(s.charAt(i) != ' ') {
//			count++;
//		}
//	}
//	System.out.println(count);
//}