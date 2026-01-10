package Collection_programs;

import java.util.ArrayList;

public class p1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(10000);
		a.add("sam");
		a.add(100);
		a.add(25.5f);
		a.add(true);
		a.add('$');
		a.add("sam");
		a.add(null);
		System.out.println(a);
	}

}
