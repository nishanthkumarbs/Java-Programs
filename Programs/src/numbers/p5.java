package numbers;

/* WAP to print odd numbers from -1 to -100 without using any loop */

public class p5 {
	
	static int num = -1;
	
	public static void main(String[] args) {
		if (num%2!=0) {
			System.out.println(num);
		}
		num--;
		if (num >= -100) {
			main(null);
		}
		
	}
}

/* 			OR 

static int num = -1;

public static void main(String[] args) {
	if (num >= -100) {
		System.out.println(num);
		num-=2;
		main(null);
	}
} 

*/