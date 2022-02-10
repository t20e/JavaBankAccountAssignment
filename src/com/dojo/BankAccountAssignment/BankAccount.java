package com.dojo.BankAccountAssignment;

import java.io.PrintStream;

public class BankAccount {

	private static Double checkingBalance = 0.0;
	private static Double savingsBalance = 0.0;
	private static int numberOfAccountsMade = (int) 0.0;
	private static Double allMoneyStoreDouble = 0.0;
	
	public BankAccount() {
		numberOfAccountsMade++;
	}
//get and set methods 
	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(long checkingBalance) {
		this.checkingBalance += checkingBalance;
	}

	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance += savingsBalance;
	}
//	withdrawl 
	public void withDrawal(double withDrawalAmount) {
		if(this.checkingBalance <= 0.0) {
			System.out.println("not enough money in bank account");
		}
		else if (this.checkingBalance - withDrawalAmount <= 0) {
			System.out.println("Not engough in account to make this transaction");
		}
		else {
			
		this.checkingBalance -= withDrawalAmount;
		System.out.println( "transaction complete");
		}
	}
//DisplayMode account balanmces 
	public PrintStream accountBalances() {
		return(System.out.printf(" $%s in checking account  %s in savings account", this.checkingBalance, this.savingsBalance));
		
	}
	
	
	
}
