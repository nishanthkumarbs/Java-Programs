package inheritence;

public class p3 extends p2 {
	int c = 300;
	public void test3() {
		System.out.println("From test3 of p3");
	}
	public static void main(String[] args) {
		p3 ob = new p3();
		System.out.println(ob.a);
		ob.test1();
		System.out.println(ob.b);
		ob.test2();
		System.out.println(ob.c);
		ob.test3();
		
	}

}
