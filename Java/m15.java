class m15
{
	static 
	{
		System.out.println("From static block of m15");
	}
	static int a = 100;
	public static void main(String[] args) 
	{
		System.out.println("From main of m15");
		System.out.println(m15.a);
		System.out.println("--------------");
		System.out.println(m14.b);
		m14.test();
	}
}
