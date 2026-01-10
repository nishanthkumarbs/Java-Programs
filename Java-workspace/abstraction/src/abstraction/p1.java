package abstraction;

public class p1 implements I3 {

	public void test1() {
		System.out.println("From test1 of p1 ");
	}
	public void test2() {
		System.out.println("From test2 of p1 ");
	}
	public void test3() {
		System.out.println("From test3 of p1 ");
	}
	public static void main(String[] args) {
		p1 ob1 = new p1();
		ob1.test1();
		ob1.test2();
		ob1.test3();
		System.out.println("-------------");
		I1 ob2 = ob1;/*Upcasting*/
		ob2.test1();
	}
}
