package encapsulation;

public class Account {

	private double balance = 50000;
	public double checkBalance() {
		return this.balance;
	}
	public void deposite(int amt) {
		this.balance = this.balance + amt;
	}
	public void withdraw(int amt) {
		this.balance = this.balance - amt;
	}
}
