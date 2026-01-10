class n11 
{
	{
		System.out.println("From non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		n11 ob1 = new n11();
		n11 ob2 = new n11();
		n11 ob3 = new n11();
	}
}
