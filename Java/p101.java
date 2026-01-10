class p101
{
	public static void main() 
	{
		System.out.println("From main-1");
	}
		public static void main(int a) 
	{
		System.out.println("From main-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main-3");
		main();
		main(100);
	}
}
