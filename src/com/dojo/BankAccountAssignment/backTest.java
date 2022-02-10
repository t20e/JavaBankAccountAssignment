package com.dojo.BankAccountAssignment;

public class backTest {

	public static void main(String[] args) {
		BankAccount david = new BankAccount();
		david.setCheckingBalance(400);
		System.out.println(david.getCheckingBalance());
		david.withDrawal(9000);
		System.out.println(david.getCheckingBalance());
		david.accountBalances();
	}
	
}
