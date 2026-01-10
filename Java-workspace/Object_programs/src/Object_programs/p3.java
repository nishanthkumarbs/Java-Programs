package Object_programs;

public class p3 implements Cloneable {
	int a = 100;
	int b = 200;
	public static void main(String[] args) throws CloneNotSupportedException{
		p3 x = new p3();

		p3 ob1 = (p3) x.clone();
		p3 ob2 = (p3) x.clone();
		p3 ob3 = (p3) x.clone();
		System.out.println(x.a+","+x.b);
		System.out.println(ob1.a+","+ob1.b);
		System.out.println(ob2.a+","+ob2.b);
		System.out.println(ob3.a+","+ob3.b);
		
	}

}
