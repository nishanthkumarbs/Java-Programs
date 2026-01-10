package abstraction;

public class Account_implementation extends Account {
	
	double balance = 50000;
	public double checkBalance() {
		return this.balance;
	}
	public void deposite(int amt) {
		this.balance += amt;
	}
	public void withdraw(int amt) {
		this.balance -= amt;
	}
}
