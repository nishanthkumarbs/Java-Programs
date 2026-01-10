class p94
{
	public static double mul(int x, float y, double z) 
	{
		double prod = x*y*z;
		return prod;
	}
	public static void main(String[] args) 
	{
		double p1 = mul(10,2.5f,123.4567d);
		System.out.println(p1);
	}
}
