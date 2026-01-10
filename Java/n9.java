class n9 
{
	public n9()
	{
		System.out.println("From constructor-1");
	}
	public n9(int a)
	{
		this();
		System.out.println("From constructor-2");
	}
	public static void main(String[] args) 
	{
		n9 ob = new n9(100);
	}
}
