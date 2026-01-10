package inheritence;

public class F extends E {

	int y = 200;
	public void test2() {
		System.out.println("From test2 of F");
	}
	
//	public static void main(String[] args) {
//		E ob1 = new E();
//		F ob2 = new F();
//		System.out.println(ob1 instanceof E);
//		System.out.println(ob1 instanceof F);
//		System.out.println(ob2 instanceof E);
//		System.out.println(ob2 instanceof F);
//	}
	
	
	public static void main(String[] args) {
		E ob1 = new E();
		if (ob1 instanceof F) {
			F ob2 = (F) ob1; /*Downcasting*/
			System.out.println("Object Down Casted");
		} else {
			System.out.println("Unable  Down Caste");
		}
	}
	
}
