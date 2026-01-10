package inheritence;

public class p13 extends p12 {
	int b;
	public p13() {
		super();
		System.out.println("From constructor-1 of p13");
		
	}
	public p13(int y, int z) {
		super(y);
		System.out.println("From constructor-2 of p13");
		this.b = z;
	}
	public static void main(String[] args) {
		p13 ob = new p13(100,200);
		System.out.println(ob.a);
		System.out.println(ob.b);
	}

}
