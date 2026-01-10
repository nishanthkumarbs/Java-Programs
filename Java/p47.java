class p47 
{
	public static void main(String[] args) 
	{
		char selector = 'E';
		switch (selector)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':{
			System.out.println(selector+" is a vowel");
			break;
		}
		default :{
			System.out.println(selector+" is a consonant");
			break;
		}
		
		}
	}
}
