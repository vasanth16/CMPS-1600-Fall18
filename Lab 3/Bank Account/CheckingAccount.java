import java.util.*;


class CheckingAccount extends BankAccount{
	private int transactionCount;

	static final double TRANSACTION_FEE = 3.0;

	public void deductFees(){
		double temp = this.getBalance() - (double)(transactionCount * TRANSACTION_FEE);
		this.setBalance(temp);
		this.transactionCount = 0;
	}
	public void withdraw(double a){
		double temp = this.getBalance() - a;
		this.setBalance(temp);
		this.transactionCount += 1;
	}

	public void deposit (double b){
		double temp = this.getBalance() + b;
		this.setBalance(temp);
		this.transactionCount += 1;
	}

	public CheckingAccount(String n, double b){
		this.setName(n);
		this.setBalance(b);;
	}
}


class BankAccountTest{
	public static void main(String[] args) {
		SavingsAccount a = new SavingsAccount("Savings1", 0.0,  1);
		CheckingAccount b = new CheckingAccount ("Checking1", 500.0);

		System.out.println(a.toString());
		System.out.println(b.toString());

		a.deposit(1000.0);
		b.withdraw(100.0);
		a.transfer(b, 200.0);

		System.out.println(a.toString());
		System.out.println(b.toString());

		a.addInterest();
		b.deductFees();

		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}