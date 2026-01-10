package String_Programs;

public class p7 {

	public static void main(String[] args) {
		String s1 = " Deep ikee   ";
		String s2 = s1.trim();
		String s3 = s2.replace('D', '$');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2.indexOf("e"));
		System.out.println(s2.lastIndexOf("e"));
	}
}
