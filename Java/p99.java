class p99 
{
	public static void test() 
	{
		System.out.println("Fron test-1");
	}
	public static void test(int a) 
	{
		System.out.println("Fron test-2");
	}
	public static void test(int x,int y) 
	{
		System.out.println("Fron test-3");
	}
	public static void main(String[] args) 
	{
		test();
		test(10);
		test(100,200);
	}
}
