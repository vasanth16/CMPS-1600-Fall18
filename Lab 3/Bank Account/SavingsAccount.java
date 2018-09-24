import java.util.*;


class SavingsAccount extends BankAccount{
	private double interestRate;

	public SavingsAccount(String n, double b, double ir){
		this.interestRate = ir;
		this.setName(n);
		this.setBalance(b);;
	}

	public void addInterest(){
		double interest = this.getBalance() * (this.interestRate/100);
		double temp = this.getBalance() + interest;
		this.setBalance(temp);
	}
}