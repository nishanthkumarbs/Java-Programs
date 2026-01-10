package encapsulation;

public class p2 {
	public static void main(String[] args) {
		p1 ob = new p1();
		System.out.println(ob.read());
		ob.write(1000);
		System.out.println(ob.read());  
		
	}

}
