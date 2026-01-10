class p100
{
	public static int add(int a, int b, int c) 
	{
		int sum = a+b+c;
		return sum;
	}
	public static double add(int x, float y, double z) 
	{
		double sum = x+y+z;
		return sum;
	}
	public static double add(float x, double y,int z) 
	{
		double sum = x+y+z;
		return sum;
	}
	public static String add(String a, char b,boolean c) 
	{
		String sum = a+b+c;
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(add(10,20,30));
		System.out.println(add(100,2505f,125.45d));
		System.out.println(add(2505f,125.45d,100));
		System.out.println(add("Java",'$',true));
	}
}
