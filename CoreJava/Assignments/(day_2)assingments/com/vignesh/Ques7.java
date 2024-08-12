package com.vignesh;

import java.util.*;



class Account{
	private String accountName;
	private String accountHolderName;
	private int accountId;
	private float totalAmount;
	
	void setter(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accountame (savings | current) : ");
		accountName=sc.nextLine();
		System.out.println("Enter the accountHolderName : ");
		accountHolderName=sc.nextLine();
		System.out.println("Enter the account Id : ");
		accountId=sc.nextInt();
		System.out.println("Enter the Amount : ");
		totalAmount=sc.nextFloat();
		display();
		
	}
	
	void display() {
		System.out.println("Your accountame  : "+this.accountName);
		
		System.out.println("Your accountHolderName : "+this.accountHolderName);
		
		System.out.println("Your account Id : "+this.accountId);
		
		System.out.println("Your Total amount : "+this.totalAmount);
		

	}
	
	void setAmount(float amount) {
		this.totalAmount+=amount;
	}
	void setWithdrawAmount(float amount) {
		this.totalAmount-=amount;
	}
	
}



public class Ques7 {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		System.out.println("Enter the option");
		System.out.println("1 . Create account");
		System.out.println("2 . Deposit amount");
		System.out.println("3 . Withdraw amount");
		
		int option = sc.nextInt();
		 switch(option) {
		 case 1:
			 account.setter();
			 break;
			 
		 case 2:
			 System.out.println("Enter the accountNumber");
			 int accountNumber = sc.nextInt();
			 System.out.println("Enter the depositing Amount");
			 float amount = sc.nextInt();
			 account.setAmount(amount);
			 account.display();
			 break;
			 
		 case 3:
			 System.out.println("Enter the withdrawing Amount");
			 float withdrawAmount = sc.nextInt();
			 account.setWithdrawAmount(withdrawAmount);
			 account.display();
			 break;
			 
		default:
			System.out.println("Enter the correct option please! ");
			 
		 }
		}
		
		
		

	}

}
