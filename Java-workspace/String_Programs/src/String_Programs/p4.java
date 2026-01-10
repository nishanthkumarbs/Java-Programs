package String_Programs;

public class p4 {

	public static void main(String[] args) {
		String s = "Pooja";
		System.out.println(s.length());
		System.out.println("----------");
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(1));
		System.out.println("----------");
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
