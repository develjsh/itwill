package com.day13;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		//Ŭ������ �ۼ��� ����, Ŭ�����κ��� ��ü�� �����Ͽ� ���
		//��ü�� ����Ѵٴ� �� - ��ü�� ������ �ִ� �Ӽ��� ����� ����Ѵٴ� ��
		
		//1. ��ü ���� - �ش� Ŭ������ ��������� �޼��带 �޸𸮿� �Ҵ�
		Account acc = new Account();
		
		//int[] arr=new int[3];
		//int a;
		
		//�ش� ��ü�� �޼��� ���
		acc.showInfo();  //��������� default������ �ʱ�ȭ��
		
		//�ι�° ��ü ����
		Account acc2;
		acc2 = new Account("100-02-123", "ȫ�浿", 100000);
		
		//������� ���
		//acc2.accId="100-02-123";
		//acc2.name="ȫ�浿";
		//acc2.balance=100000;
		
		//�޼��� ���
		acc2.showInfo();
		acc2.withdraw(30000);  	//3���� ���
		acc2.deposit(50000);	//5���� �Ա�
		acc2.showInfo();

		//��
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		/*
		 1. ��ü �����ϴ� ���
		 Ŭ������  �������� = new Ŭ������();
		 
		 2. ��ü ��� - ��������� �޼��� ���
		 ��������.�������
		 ��������.�޼���()		 
		 */
	}

}
