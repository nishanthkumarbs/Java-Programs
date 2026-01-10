class p90
{
	public static void mul(int x, float y, double z) 
	{
		double prod = x*y*z;
		System.out.println("Product = "+prod);
	}
	public static void main(String[] args) 
	{
		mul(10,2.5f,123.4567d);
		mul(20,4.5f,198.4567d);
	}
}
