class n7 
{
	int a;
	int b;
	public n7(int x, int y)
	{
		a = x;
		b = y;
	}
	public static void main(String[] args) 
	{
		n7 ob1 = new n7(100,200);
		System.out.println(ob1.a+","+ob1.b);
		n7 ob2 = new n7(500,1000);
		System.out.println(ob2.a+","+ob2.b);
		n7 ob3 = new n7(400,800);
		System.out.println(ob3.a+","+ob3.b);
	}
}
