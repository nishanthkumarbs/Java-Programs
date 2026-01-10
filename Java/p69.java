class p69 
{
	public static void main(String[] args) 
	{
		int even_sum = 0;
		int odd_sum = 0;
		int i = 1;
		do
		{
			if (i%2==0)
			{
				even_sum += i;
			}
			else
			{
				odd_sum += i;
			}
			i++;
		}
		while (i<=20);
		System.out.println("even_sum = "+even_sum);
		System.out.println("odd_sum = "+odd_sum);
	}
}
