class p58 
{
	public static void main(String[] args) 
	{
		int row = 5;
		int col = 5;
		int i = 1;
		while (i<=row)
		{
			int j = 1;
			while (j<=col)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
