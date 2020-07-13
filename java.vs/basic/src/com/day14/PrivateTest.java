package com.day14;

import com.day13.CCC;

public class PrivateTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.name = "ȫ�浿";  //default�� ���� ��Ű���̹Ƿ� ���� ����
		//obj.age = 20; //error, private�� age�� �ٸ� Ŭ�����̹Ƿ� ���� �Ұ�
		//=> The field AAA.age is not visible
		
		obj.showInfo(); //public �޼���� ��𿡼��� ȣ�� ����
		
		BBB b = new BBB();
		//b.num1=10;  //error: private
		b.num2=20;	//default
		b.num3=30;	//protected	
		b.num4=40;	//public
		
		b.showInfo();
		
		CCC c = new CCC();
		//c.val1 = 100;  //error: private
		//c.val2 = 200;	//error: default
		//c.val3 = 300;	//error: protected, The field CCC.val3 is not visible	
		c.val4 = 400;	//public
		
		c.showInfo();
		
		//DDD d = new DDD();  //error: default
	}

}//class

/*
 ���� ������ - Ŭ������ ����� ���Ǿ� �ܺηκ����� ������ �����ϴ� ����
 public > protected > default(������) > private
 
 [1] private - ���� Ŭ���������� ���� ����
 [2] default - ���� ��Ű�������� ���� ����
 [3] protected - ���� ��Ű���� ���� �ٸ� ��Ű�������� ��Ӱ��迡���� ���� ����
 [4] public - ��𿡼��� ���� ���� 
 
 Ŭ����, ������ - public, default
 �޼���, ������� - public, protected, default, private
 �������� - ���Ұ�
  */

class AAA{
	private int age;  	//���� Ŭ���������� ���� ����
	String name;		//���� ��Ű�������� ���� ����
	
	public void showInfo() {
		System.out.println("���� : " + age);
		System.out.println("�̸� : " + name);
	}
}//class





