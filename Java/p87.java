class p87 
{
	public static void main(String[] args) 
	{
		System.out.println("From Main Begin");
		test1();
		System.out.println("From Main End");
	}
	public static void test1() 
	{
		System.out.println("From test1 Begin");
		test2();
		System.out.println("From test1 End");
	}
	public static void test2() 
	{
		System.out.println("From test2");
	}
}
