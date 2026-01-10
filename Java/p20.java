class p20 
{
	public static void main(String[] args) 
	{
		int a = 10000;
		int b = 2500;
		int c = 500;
		int d = a>b ? a : b;
		int greatest = d > c ? d : c;
		System.out.println(greatest);

		//OR

		int great = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(great);


	}

}
