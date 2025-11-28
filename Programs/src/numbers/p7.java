package numbers;

/* WAP to find the sum of Natural numbers from 1 to 100 without using any loop */

public class p7 {
	
	static int num = 1;
	static int natural_sum = 0;
	
	public static void main(String[] args) {
		if (num <= 100) {
			natural_sum+=num;
			num++;
			main(null);
		} else {
			System.out.println("Natural Sum = "+natural_sum);
		}
	}

}
