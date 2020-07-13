package com.day15;

public class BankAccount {
	//�������
	//[1] �ν��Ͻ� ����
	private int balance;
	
	//[2] static����(Ŭ���� ����)
	private static int totalBalance; //�� ����(��ü)�� ������ �հ�
	public static final double INTEREST_RATE=1.7;  //������
	
	//������
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//getter/setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		//static������ this ��� �Ұ�
		BankAccount.totalBalance = totalBalance;
	}
	
	//�޼���
	public void calcTotalBalance() {
		totalBalance += balance;
	}
}
