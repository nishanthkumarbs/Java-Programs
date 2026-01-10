class n1 
{
	int a = 100;
	public void test()
	{
		System.out.println("From test");

	}
	public static void main(String[] args) 
	{
		n1 ob1 = new n1();
		System.out.println(ob1);
		System.out.println(ob1.a);
		ob1.test();
		System.out.println("----------");
		n1 ob2 = new n1();
		System.out.println(ob2);
		System.out.println(ob2.a);
		ob2.test();
		System.out.println("----------");
		n1 ob3 = new n1();
		System.out.println(ob3);
		System.out.println(ob3.a);
		ob3.test();
	}
}
