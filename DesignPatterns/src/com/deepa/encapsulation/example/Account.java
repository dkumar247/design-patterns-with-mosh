package com.deepa.encapsulation.example;

public class Account {

//	Bundling the data and methods that operate on the data within one unit, and hiding the state of an object inside the unit/class.
	
	private float balance;
	
	public void setBalance(float balance) {
		if(balance > 0) {
			this.balance = balance;
		}
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void deposit(float amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(float amount) {
		if(amount > 0) {
			balance -= amount;
		}
	}
	
}
