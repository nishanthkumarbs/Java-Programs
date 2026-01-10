package inheritence;

public class p9 extends p8 {
	int b = 200;
	static int y = 1000;
	public static void test2() {
		System.out.println("From static test2 of p9");
	}
	public static void main(String[] args) {
		p9 ob1 = new p9();
		System.out.println(ob1.a);
		System.out.println(ob1.x);
		ob1.test1();
		System.out.println(ob1.b);
		System.out.println(ob1.y);
		ob1.test2();
		System.out.println("-------------");
		
		p9 ob2 = new p9();
		System.out.println(ob2.a);
		System.out.println(ob2.x);
		ob2.test1();
		System.out.println(ob2.b);
		System.out.println(ob2.y);
		ob2.test2();
	}
}
