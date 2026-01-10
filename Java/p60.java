class p60 
{
	public static void main(String[] args) 
	{
		int num = 4554;
		int temp = num;
		int reverse = 0;
		int last_digit;
		while (temp!=0)
		{
			last_digit = temp%10;
			temp /= 10;
			reverse =reverse*10+last_digit;
		}
		if (num == reverse)
		{
			System.out.println(num+" is a palandrome");
		}
		else
		{
			System.out.println(num+" is not a palandrome");
		}
		
	}
}
