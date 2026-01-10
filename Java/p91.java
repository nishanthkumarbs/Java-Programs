class p91
{
	public static void concat(String a, char b, boolean c) 
	{
		String res =a+b+c;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		concat("Java",'$',true);
		concat("Python",'@',false);
	}
}
