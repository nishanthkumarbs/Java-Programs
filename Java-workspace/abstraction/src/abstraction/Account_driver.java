package abstraction;

public class Account_driver {
	public static void main(String[] args) {
		Account a = new Account_implementation();
		System.out.println(a.checkBalance());
		a.deposite(25000);
		System.out.println(a.checkBalance());
		a.withdraw(5000);
		System.out.println(a.checkBalance());
	}

}
