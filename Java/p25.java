class p25 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 15;
		int c = 20;
		boolean res = !((a+b >= a+c) && (b-a*c == c-a*c) || !(b/a != c/a));
		System.out.println(res);
	}
}
