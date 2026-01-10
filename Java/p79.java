class p79 
{
	public static void main(String[] args) 
	{
		int row = 5;
		int col = 5;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				System.out.print((i + j +i) % 2);
			}
			System.out.println();
		}
	}
}
