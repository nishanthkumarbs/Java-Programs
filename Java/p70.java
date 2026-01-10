class p70 
{
	public static void main(String[] args) 
	{
		int row = 5;
		int col = 5;
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print("*");
				j++;
			}
			while (j<=col);
			i++;
			System.out.println();
		}
		while (i<=row);
	}
}
