class  p21
{
	public static void main(String[] args) 
	{
		int a = 850;
		int b = 900;
		int c = 800;
		int sg = a>b ? (b>c?b:a>c?c:a) : (a>c?a:b>c?c:b);
		System.out.println(sg);
	}
}
