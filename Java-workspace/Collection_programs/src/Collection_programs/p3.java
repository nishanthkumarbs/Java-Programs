package Collection_programs;

import java.util.LinkedList;
import java.util.Vector;

public class p3 {
	public static void main(String[] args) {
		LinkedList v = new LinkedList();
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
