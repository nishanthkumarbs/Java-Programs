class n13
{
	{
		System.out.println("From non static block-1");
	}
	{
		System.out.println("From non static block-2");
	}
	public static void main(String[] args) 
	{
		n13 ob1 = new n13();
		n13 ob2 = new n13();
	}
	{
		System.out.println("From non static block-3");
	}
}
