class n4 
{
	static int x = 100;
	static float y = 25.45f;
	int a = 500;
	float b = 150.25f;
	public static void main(String[] args) 
	{
		n4 ob1 = new n4();
		n4 ob2 = new n4();
		ob1.x = 800;
		ob2.b = 245.65f;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		System.out.println("----------");
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
	}
}
