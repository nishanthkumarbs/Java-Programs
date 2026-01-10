class n6 
{
	public n6(int a)
	{
		System.out.println("From constructor-1");
	}
	public n6(int a, int b)
	{
		System.out.println("From constructor-2");
	}
	public n6(int a, int b, int c)
	{
		System.out.println("From constructor-3");
	}
	public static void main(String[] args) 
	{
		n6 ob1 = new n6(100);
		n6 ob2 = new n6(100,200);
		n6 ob3 = new n6(100,200,300);
	}
}
