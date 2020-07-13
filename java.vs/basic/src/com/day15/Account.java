package com.day15;

public class Account {
	private String accId;
	private int balance;
	
	public Account(String accId, int balance) {
		this.accId=accId;
		this.balance=balance;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void showInfo() {
		System.out.println("���¹�ȣ : " + accId);
		System.out.println("�ܾ� : " + balance+"\n");		
	}
}
