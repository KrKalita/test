package com.javafee.bank;

public class BankAccount {
	public Double account = 0.0;

	public void setState(Double amount) {
		account = amount;
	}

	public void income(Double amount) {
		account = account + amount;
	}

	public void payment(Double amount) {
		account = account - amount;
	}

	public void showAccountState() {
		System.out.println("stan konta: " + account);
	}
}
