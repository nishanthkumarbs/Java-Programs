package String_Programs;

public class p5 {

	public static void main(String[] args) {
		String s1 = "Deepika";
		String s2 = s1.substring(1);
		String s3 = s2.substring(0, 5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.isEmpty());
		System.out.println(s1.contains("Deep"));
	}
}
