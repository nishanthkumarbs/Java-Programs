class p96 
{
	public static int test(boolean condition) 
	{
		if (condition)
			return 500;
		else
			return 1000;
	}
	public static void main(String[] args)
	{
		System.out.println(test(true));
	}
}
