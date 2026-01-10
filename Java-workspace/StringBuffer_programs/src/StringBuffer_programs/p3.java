package StringBuffer_programs;

public class p3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.setCharAt(0, '$');
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
