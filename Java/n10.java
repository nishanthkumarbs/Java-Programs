class n10 
{
	int a,b;
	public n10(int x)
	{
		System.out.println("From constructor-1");
		this.a = x;
	}
	public n10(int y, int z)
	{
		this(y);
		System.out.println("From constructor-2");
		this.b = z;
	}
	public static void main(String[] args) 
	{
		n10 ob = new n10(100,200);
		System.out.println(ob.a);
		System.out.println(ob.b);
	}
}
