class p48 
{
	public static void main(String[] args) 
	{
		int a= 100 , b=50;
		String operator = "+";
		switch (operator)
		{
		case "+":{
			int sum = a+b;
			System.out.println("Sum = "+sum);
			break;
		}
		case "-":{
			int dif = a-b;
			System.out.println("dif = "+dif);
			break;
		}
		case "*":{
			int prod = a*b;
			System.out.println("Prod = "+prod);
			break;
		}
		}
	}
}
