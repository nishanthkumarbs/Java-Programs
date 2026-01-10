class n3 
{
	static int a = 500;
	public static void test1()
	{
		System.out.println("From static test1");
	}
	int x = 100;
	public void test2()
	{
		System.out.println("From non static test2");
	}
	public static void main(String[] args) 
	{
		n3 ob1 = new n3();
		System.out.println(ob1.x);
		ob1.test2();
		System.out.println(ob1.a);
		ob1.test1();
		System.out.println("----------");
		n3 ob2 = new n3();
		System.out.println(ob2.x);
		ob2.test2();
		System.out.println(ob2.a);
		ob2.test1();
	}
}
