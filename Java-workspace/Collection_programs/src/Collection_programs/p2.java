package Collection_programs;

import java.util.Vector;

public class p2 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("sam");
		v.add(100);
		v.add(25.5f);
		v.add(true);
		v.add('$');
		v.add("sam");
		v.add(null);
		System.out.println(v);
	}
}
