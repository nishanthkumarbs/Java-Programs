package polymorphism;

public class Bank_Driver {
	public static void main(String[] args) {
		
		Bank b1 = new ICICI();
		Bank b2 = new Axis();
		Bank b3 = new HDFC();
		System.out.println(b1.rateOfIntrest());
		System.out.println(b2.rateOfIntrest());
		System.out.println(b3.rateOfIntrest());
	}
	
	

}
