package encapsulation;

public class Bank_deriver {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.checkBalance());
		a.deposite(10000);
		System.out.println(a.checkBalance());
		a.withdraw(5000);
		System.out.println(a.checkBalance());
	}

}
