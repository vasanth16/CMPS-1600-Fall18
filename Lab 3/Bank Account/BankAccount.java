import java.util.*;


class BankAccount{
	private String name;
	private double balance;


	public String getName (){
		return this.name;
	}

	public void setName(String n){
		this.name = n;
	}

	public double getBalance(){
		return this.balance;
	}

	public void setBalance(double s){
		this.balance = s;
	}

	public void withdraw(double a){
		this.balance = this.balance - a;
	}

	public void deposit (double b){
		this.balance = this.balance + b;
	}
	public BankAccount(){
	}

	public void transfer (BankAccount other, double amount){
		this.balance = this.balance - amount;
		other.balance += amount;
	}
	public String toString(){
		return "Your bank account: "+ this.name + " has a balance of "+ this.balance;
	}

	public BankAccount (String n, double b){
		this.name = n;
		this.balance = b;
	}
}