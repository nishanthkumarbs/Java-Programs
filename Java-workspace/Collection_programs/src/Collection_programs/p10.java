package Collection_programs;

import java.util.HashSet;
import java.util.LinkedList;

public class p10 {
	public static void main(String[] args) {
		HashSet v = new HashSet();
		v.add("sam");
		v.add(100);
		v.add(25.5f);
		v.add(true);
		v.add('$');
		v.add("sam");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
	}

}
