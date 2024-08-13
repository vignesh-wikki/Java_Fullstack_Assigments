package com.assignments;

class BankAccount{
	protected int accountBalance;
	
	BankAccount(){
		this.accountBalance=0;
	}
		void deposit(int amount ) {
			this.accountBalance+=amount;
		}
		
		void withdraw(int amount ) {
			this.accountBalance-=amount;
		}
}

class SavingsAccount extends BankAccount{
	
	void withdraw(int amount) {
		if(amount <= super.accountBalance)
			this.accountBalance-=amount;
	}
	
}

public class Ques5 {

	public static void main(String []a) {
		BankAccount bank = new BankAccount();
		bank.deposit(1000);
		bank.withdraw(200);
		SavingsAccount acc = new SavingsAccount();
		acc.withdraw(900);
	}

}
