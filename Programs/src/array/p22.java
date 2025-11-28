package array;

/* Write a program for linear search */

public class p22 {
	public static void linearSearch(int[] a, int key) {
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == key) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(key+" is Prasent");
		} else {
			System.out.println(key+" is Not Prasent");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {40,25,10,20,50};
		linearSearch(a, 20);
		
	}

}
