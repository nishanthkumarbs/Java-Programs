package StringBuffer_programs;

public class p2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.insert(1, '@');
		System.out.println(sb);
		sb.insert(3, 5.5);
		System.out.println(sb);
	}

}
