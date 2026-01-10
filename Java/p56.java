class p56 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int even_sum = 0;
		int odd_sum = 0;
		while (i<=20)
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
		System.out.println("even_sum = "+even_sum);
		System.out.println("odd_sum = "+odd_sum);
	}
}
