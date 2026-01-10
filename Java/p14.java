class p14 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 15;
		int c = a++ + --b + b--;
		int d = c-- - ++a + --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
