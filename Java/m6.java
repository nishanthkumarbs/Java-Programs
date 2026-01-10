class m6 
{
	static int a = 1;
	public static void main(String[] args) 
	{
		System.out.println(a++);
		if(a<=100)
		{
			main(null);
		}
	}
}
