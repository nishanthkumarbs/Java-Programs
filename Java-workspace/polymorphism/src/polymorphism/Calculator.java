package polymorphism;

public class Calculator {
	public static void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum = "+sum);
	}
	public static void add(int a, float b, double c) {
		double sum = a+b+c;
		System.out.println("Sum = "+sum);
	}
	public static void add(String a, char b, boolean c) {
		String sum = a+b+c;
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args) {
		add(10,20,30);
		add(10,25.5f,123.456d);
		add("Java",'$',true);  
	}
}
