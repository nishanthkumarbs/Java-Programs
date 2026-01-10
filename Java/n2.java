class n2 
{
	int a;
	int b;
	public static void main(String[] args) 
	{
		n2 ob1 = new n2();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.a = 100;
		ob1.b = 200;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println("---------");
		n2 ob2 = new n2();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
	}
}
