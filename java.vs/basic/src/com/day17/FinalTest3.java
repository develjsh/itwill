package com.day17;

class AAA{
	public final double PI = 3.141592;
	final static int DELIVERY = 3000; //��ۺ�
	int age;
}//class

public class FinalTest3 {
	public static void main(String[] args) {
		int num=10;
		final double INTEREST_RATE=1.6;
		
		AAA obj = new AAA();
		System.out.println("num="+num+", PI="+ obj.PI);
		System.out.println("��ۺ� : " + AAA.DELIVERY);
		System.out.println("������ : " + INTEREST_RATE);
		
		obj.age=25;
		//obj.PI = 3.14; //error: ����� �� ���� �Ұ�
		//=> The final field AAA.PI cannot be assigned
		
		//AAA.DELIVERY = 2500;  //error
		
		num=30;
		//INTEREST_RATE = 1.8;  //error
	}
}
