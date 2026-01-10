package Collection_programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class p4 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("sam");
		a.add("Disha");
		a.add("Deepika");
		a.add("Thamanna");
		a.add("Katrina");
		System.out.println(a);
		System.out.println("--------------------");
		LinkedList<String> l = new LinkedList<String>(a);
		System.out.println(l);
	}

}
