package inheritence;

public class C extends B{
	
	int z = 300;
	public void test3() {
		System.out.println("From test3 of C");
	}

	public static void main(String[] args) {
		C ob1 = new C();
		System.out.println(ob1.x);
		ob1.test1();
		System.out.println(ob1.y);
		ob1.test2();
		System.out.println(ob1.z);
		ob1.test3();
		
		System.out.println("-------------");
		
		B ob2 = ob1; /*upcasting*/
		System.out.println(ob2.x);
		ob2.test1();
		System.out.println(ob2.y);
		ob2.test2();
		

		
	}
}
