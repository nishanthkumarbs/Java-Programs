class p59 
{
	public static void main(String[] args) 
	{
		int num = 456;
		int temp = num;
		int reverse = 0;
		int last_digit;
		while (temp!=0)
		{
			last_digit = temp%10;
			temp /= 10;
			reverse =reverse*10+last_digit;
		}
		System.out.println("Reversed No = "+reverse);
	}
}
