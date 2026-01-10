package abstraction;

public class m2 extends m1{
	public void test1() {
		System.out.println("From test1 of m1");
		
	}
	public void test2(int x) {
		System.out.println("From test2 of m2");
		
	}
	public m2() {
		System.out.println("From constructor of m2");
	}
	public static void main(String[] args) {
		m2 ob1 = new m2();
		ob1.test1();
		ob1.test2(0);
		System.out.println("------------");
		m1 ob2 = ob1; /*Upcasting*/
		ob2.test1();
		ob2.test2(0);
	}

}
